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
         stackA.peek();
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
}
