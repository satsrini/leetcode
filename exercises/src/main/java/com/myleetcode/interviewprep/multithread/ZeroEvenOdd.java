package com.myleetcode.interviewprep.multithread;

import java.util.function.IntConsumer;
import java.util.concurrent.atomic.AtomicInteger;

public class ZeroEvenOdd
{

   private int n;
   private AtomicInteger count;
   private boolean isZero;

   public ZeroEvenOdd(int n)
   {
      this.n = n;
      this.count = new AtomicInteger(0);
      isZero = true;
   }

   public void zero(IntConsumer printConsumer) throws InterruptedException
   {

      synchronized(count)
      {
         while(count.intValue() < n)
         {
            if(isZero)
            {
               printConsumer.accept(0);
               isZero = false;
               count.notifyAll();
            }else
            {
               count.wait();
            }
         }
         
      }
      
   }

   public void even(IntConsumer printConsumer) throws InterruptedException
   {
      synchronized(count)
      {
         while(count.intValue() < n)
         {
            if(!isZero && count.intValue()%2 ==1)
            {
               printConsumer.accept(count.incrementAndGet());
               isZero = true;
               count.notifyAll();
            }else
            {
               count.wait();
            }
         }
      }
   }

   public void odd(IntConsumer printConsumer) throws InterruptedException
   {

      synchronized(count)
      {

         while(count.intValue() < n)
         {
            if(!isZero && count.intValue()%2 == 0)
            {
               printConsumer.accept(count.incrementAndGet());
               isZero = true;
               count.notifyAll();
            }else
            {
               count.wait();
            }
         }
      }
   }

   public static void main(String[] args)
   {
      System.out.println("Hello ZeroEvenOdd");

      ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);

      IntConsumer intConsumer = (n) -> System.out.print(n);

      Thread threadA = new Thread(() -> 
                                        {  
                                           try{
                                             zeroEvenOdd.zero(intConsumer);
                                           }catch(InterruptedException e)
                                           {
                                             e.printStackTrace();
                                           }
                                        });
      Thread threadB = new Thread(() -> 
                                        {
                                           try{
                                               zeroEvenOdd.odd(intConsumer);
                                           }catch(InterruptedException e)
                                           {
                                             e.printStackTrace();
                                           }
                                        });
      Thread threadC = new Thread(() -> 
                                        {
                                           try{
                                              zeroEvenOdd.even(intConsumer);
                                           }catch(InterruptedException e)
                                           {
                                              e.printStackTrace();
                                           }
                                        });


 
      System.out.println("\n\n");     
      threadC.start();
      threadB.start();
      threadA.start();


      try
      {
         threadC.join();
         threadB.join();
         threadA.join();
      }catch(InterruptedException e)
      {
         e.printStackTrace();
      }

      System.out.println("\n\n");

   }

}
