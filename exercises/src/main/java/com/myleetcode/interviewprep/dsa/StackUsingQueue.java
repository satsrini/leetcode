package com.myleetcode.interviewprep.dsa;

/*
 * Leetcode: https://leetcode.com/problems/implement-stack-using-queues/
 *
 */

public class StackUsingQueue<T>
{
 
  private Queue<T> queueA;
  private Queue<T> queueB;
 
  public StackUsingQueue()
  {
     queueA = new Queue<>();
     queueB = new Queue<>();
  }

  public void push(T t)
  {

    while(!queueA.isEmpty())
    {
       queueB.enqueue(queueA.dequeue());
    }

    queueA.enqueue(t);

    while(!queueB.isEmpty())
    {
      queueA.enqueue(queueB.dequeue());
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

}
