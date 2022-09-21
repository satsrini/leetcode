package com.myleetcode.interviewprep.dsa;

/*
 * Leetcode: https://leetcode.com/problems/implement-stack-using-queues/
 *
 */

public class StackUsingQueue<T>
{
 
  private Queue<T> queueA;
 
  public StackUsingQueue()
  {
     queueA = new Queue<>();
  }

  public void push(T t)
  {

    queueA.enqueue(t);

    int count = queueA.size();

    while(count > 1)
    {
       queueA.enqueue(queueA.dequeue());
       count--;
    }

  }

  public T pop()
  {
     return queueA.dequeue();
  }

  public T top()
  {
    return queueA.peek();
  }

  public boolean isEmpty()
  {
     return queueA.isEmpty();
  }

  public int size()
  {
     return queueA.size();
  }

  public static void main(String[] args)
  {
      StackUsingQueue<Integer> stack = new StackUsingQueue<>();

      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);

      System.out.println("SIZE: " + stack.size());

      int N = stack.size();

      for(int i = 0; i < N; i++)
      {
         System.out.print(" " + stack.pop());
      }
  }

}
