package com.myleetcode.interviewprep.multithread;

public class PrintInOrder
{

   private Object lock = new Object();
   private int counter = 1;

   public PrintInOrder()
   {

   }

   public void first()
   {
      synchronized(lock)
      {
         System.out.println("First");
         counter = 2;
         lock.notifyAll();
      }
   }

   public void second()
   {

      synchronized(lock)
      {
         while(counter != 2)
         {
            try
            {
              lock.wait();
            }catch(InterruptedException e)
            {
              e.printStackTrace();
            }
         }

         System.out.println("Second");
         counter = 3;
         lock.notifyAll();
      }
   }

   public void third()
   {

      synchronized(lock)
      {
         while(counter != 3)
         {
            try
            {
               lock.wait();
            }catch(InterruptedException e)
            {
               e.printStackTrace();
            }
         }
         System.out.println("Third");
      } 

   }

   public static void main(String[] args)
   {
      System.out.println("Hello Print In Order");

      PrintInOrder printInOrder = new PrintInOrder();

      Thread t1 = new Thread(() -> printInOrder.first(), "First Thread");

      Thread t2 = new Thread(() -> printInOrder.second(), "Second Thread");

      Thread t3 = new Thread(() -> printInOrder.third(), "Third Thread");

      try
      {
        t3.start();
        t2.start();
        t1.start();
      }catch(Exception e)
      {
         e.printStackTrace();
      }

      try
      {
        t1.join();
        t2.join();
        t3.join();
      }catch(InterruptedException e)
      {
         e.printStackTrace();
      }

   }

}
