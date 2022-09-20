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
      if(isEmpty())
      {
         head = new Node<>(t, null);
         current = head;
         return;
      }

      Node<T> x = new Node<>(t,null);
      current.next = x;
      current = current.next;
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
}
