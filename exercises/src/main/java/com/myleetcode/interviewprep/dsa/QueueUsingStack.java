package com.myleetcode.interviewprep.dsa;

/*
 *
 * Leetcode: https://leetcode.com/problems/implement-queue-using-stacks/
 *
 */

public class QueueUsingStack<T>
{

    private Stack<T> stackA;
    private Stack<T> stackB;

    public QueueUsingStack()
    {
       stackA = new Stack<>();
       stackB = new Stack<>();
    }

    public void enqueue(T t)
    {

       while(!stackA.isEmpty())
       {
          stackB.push(stackA.pop());
       }

       stackB.push(t);

       while(!stackB.isEmpty())
       {
          stackA.push(stackB.pop());
       }

  
       
    }

    public T dequeue()
    {
       return stackA.pop();
    }

    public T peek()
    {
      return stackA.peek();
    }

    public boolean isEmpty()
    {
      return stackA.isEmpty();
    }

    public int size()
    {
      return stackA.size();
    }

    public static void main(String[] args)
    {
       QueueUsingStack<Integer> queue = new QueueUsingStack<>();
       queue.enqueue(1);
       queue.enqueue(2);
       queue.enqueue(3);
       queue.enqueue(4);
       queue.enqueue(5);

       System.out.println("SIZE " + queue.size());

       int N = queue.size();

       for(int i = 0; i < N; i++)
       {
          System.out.print(" " + queue.dequeue());
       }
 
    }

}
