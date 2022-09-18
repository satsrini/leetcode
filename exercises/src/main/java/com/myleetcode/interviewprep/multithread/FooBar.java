package com.myleetcode.interviewprep.multithread;

public class FooBar
{

    private int n;
    private Object lock;
    private boolean isFoo;

    public FooBar(int n)
    {
       this.n = n;
       this.lock = new Object();
       isFoo = true;
    }

    public void foo(Runnable printFoo) throws InterruptedException
    {
       for(int i = 0; i < n; i++)
       {
          synchronized(lock)
          {
             if(!isFoo)
             {
                lock.wait();
             }
                
             printFoo.run();
             isFoo = false;
             lock.notify();
          }
       }
    }

    public void bar(Runnable printBar) throws InterruptedException
    {

       for(int i = 0; i < n; i++)
       {

           synchronized(lock)
           {
              if(isFoo)
              {
                 lock.wait();
              }
              
              printBar.run();
              isFoo = true;
              lock.notify();
           }
       }

    }

    public static void main(String[] args)
    {
       System.out.println("Hello FooBar\n\n");

       FooBar foobar = new FooBar(10);

       Runnable fooRunnable = () -> System.out.print("foo");
       Runnable barRunnable = () -> System.out.print("bar");

       Thread threadA = new Thread(() -> 
                                    {
                                       try
                                       {
                                          foobar.foo(fooRunnable);
                                       }catch(InterruptedException e)
                                       {
                                          e.printStackTrace();
                                       }
                                    });
       Thread threadB = new Thread(() -> 
                                    {
                                       try
                                       {
                                          foobar.bar(barRunnable);
                                       }catch(InterruptedException e)
                                       {
                                          e.printStackTrace();
                                       }
                                    });
       
       threadA.start();
       threadB.start();

       try
       {
          threadA.join();
          threadB.join();
       }catch(InterruptedException e)
       {
          e.printStackTrace();
       }

       System.out.println("\n\n\n");

    }

}

