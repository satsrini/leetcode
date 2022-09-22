package com.myleetcode.interviewprep.dsa;

/*
 * Leetcode: https://leetcode.com/problems/implement-queue-using-stacks/
 *
 */

public class QueueUsingStackAmortized<T>
{

   private Stack<T> stackA;
   private Stack<T> stackB;
   private T front;

   public QueueUsingStackAmortized()
   {
      stackA = new Stack<>();
      stackB = new Stack<>();
   }

   public void enqueue(T t)
   {
      stackB.push(t);

      if(stackA.isEmpty())
      {
         front = t;
      }

   }

   public T dequeue()
   {

      if(stackA.isEmpty())
      {
         while(!stackB.isEmpty())
         {
            stackA.push(stackB.pop());
         }
      }

      front = stackA.peek();

      return stackA.pop();
   }

   public T peek()
   {

      if(!stackA.isEmpty())
      {
         front = stackA.peek();
      }

      return front;
   }

   public int size()
   {
      return stackA.size() + stackB.size();
   }

   public boolean isEmpty()
   {
      return stackA.isEmpty() && stackB.isEmpty();
   }

   public static void main(String[] args)
   {
      QueueUsingStackAmortized<Integer> queueUsingStackAmortized = new QueueUsingStackAmortized<>();

      queueUsingStackAmortized.enqueue(1);
      queueUsingStackAmortized.enqueue(2);
      queueUsingStackAmortized.enqueue(3);
      queueUsingStackAmortized.enqueue(4);
      queueUsingStackAmortized.enqueue(5);

      System.out.println("\n");
      System.out.println("SIZE:   " + queueUsingStackAmortized.size());
      int N = queueUsingStackAmortized.size();
      for(int i = 0; i < N; i++)
      {
         System.out.print(" " + queueUsingStackAmortized.dequeue());
      }
      System.out.println("\n");
      System.out.println("EMPTY: " + queueUsingStackAmortized.isEmpty());


      System.out.println("\n");
      System.out.println("ENQUEING TWO MORE");
      queueUsingStackAmortized.enqueue(6);
      queueUsingStackAmortized.enqueue(7);

      N = queueUsingStackAmortized.size();

      System.out.println("\n");
      for(int i = 0; i < N; i++)
      {
         System.out.print(" " + queueUsingStackAmortized.dequeue());
      }

      System.out.println("\n");

   }
}
