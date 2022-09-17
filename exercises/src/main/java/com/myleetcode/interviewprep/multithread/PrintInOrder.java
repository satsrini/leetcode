package com.myleetcode.interviewprep.multithread;

public class PrintInOrder
{

   public PrintInOrder()
   {

   }

   public void first(Runnable printFirst) throws InterruptedException
   {
      printFirst.run();
   }

   public void second(Runnable printSecond) throws InterruptedException
   {
      printSecond.run();
   }

   public void third(Runnable printThird) throws InterruptedException
   {
      printThird.run();
   }

   public static void main(String[] args)
   {
      System.out.println("Hello Print In Order");
   }

}
