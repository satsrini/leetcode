package com.myleetcode.interviewprep.dsa;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>
{

   private Node<T> head;
   private Node<T> current = head;
   private int N;

   public Queue()
   {
      N = 0;
   }

   public void enqueue(T t)
   {

      Node<T> x = new Node<>(t,null);
      if(isEmpty())
      {
         head = x;
         current = head;
      }else
      {
        current.next = x;
        current = current.next;
      }
      N++;

   }

   public T dequeue()
   {

      if(isEmpty())
      {
         return null;
      }

      Node<T> x = head;
      head = head.next;
      N--;

      return x.value;
   }

   public boolean isEmpty()
   {
      return N==0;
   }

   public int size()
   {
      return N;
   }

   @Override
   public Iterator<T> iterator()
   {
     return new QueueIterator<>(this);
   }

   class QueueIterator<T> implements Iterator<T>
   {

      private Node<T> currentNode;

      QueueIterator(Queue<T> queue)
      {
         currentNode = queue.head;
      }

      @Override
      public boolean hasNext()
      {
          return currentNode != null;
      }

      @Override
      public T next()
      {

          if(currentNode == null)
          {
              return null;
          }

          Node<T> x = currentNode;
          currentNode = currentNode.next;
          return x.value;
      }

   }

   public static void main(String[] args)
   {
      Queue<Integer> queue = new Queue<>();

      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.enqueue(5);

      System.out.println("SIZE: " + queue.size());

      System.out.println("\n\n");
      for(int i:queue)
      {
         System.out.print(" " + i);
      }
      System.out.println("\n\n");

      System.out.println("\n\n");
      for(int i:queue)
      {
         System.out.print(" " + i);
      }
      System.out.println("\n\n");

      System.out.println("DEQUEUING");
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());

      System.out.println("SIZE: " + queue.size());

      System.out.println("\n\n");
      for(int i:queue)
      {
         System.out.print(" " + i);
      }
      System.out.println("\n\n");


      System.out.println("ENQUEUING");
      queue.enqueue(6);
      queue.enqueue(7);
      System.out.println("SIZE: " + queue.size());

      System.out.println("\n\n");
      for(int i:queue)
      {
         System.out.print(" " + i);
      }
      System.out.println("\n\n");


   }
}
