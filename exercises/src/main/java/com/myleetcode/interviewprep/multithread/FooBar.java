package com.myleetcode.interviewprep.multithread;

public class FooBar
{

    private int n;

    public FooBar(int n)
    {
       this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException
    {
       for(int i = 0; i < n; i++)
       {
          printFoo.run();
       }
    }

    public void bar(Runnable printBar) throws InterruptedException
    {

       for(int i = 0; i < n; i++)
       {
           printBar.run();
       }

    }

    public static void main(String[] args)
    {
       System.out.println("Hello FooBar");
    }

}

