package com.myleetcode.interviewprep.dsa;

/*
 * Leetcode: https://leetcode.com/problems/implement-queue-using-stacks/
 *
 */

public class QueueUsingStackAmortized<T>
{

   private Stack<T> stackA;
   private Stack<T> stackB;

   public QueueUsingStackAmortized(){}

   public void enqueue(T t)
   {
      stackA = new Stack<>();
      stackB = new Stack<>();
   }

   public T dequeue()
   {
      return null;
   }

   public T peek()
   {
      return null;
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
