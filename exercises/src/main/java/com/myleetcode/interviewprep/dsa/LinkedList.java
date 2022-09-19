package com.myleetcode.interviewprep.dsa;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>
{

   private Node<T> head;
   private Node<T> tail;

   public LinkedList(){}

   public void add(T t)
   {
      if(head == null)
      {
        head = new Node<>(t, null);        
        return;
      }

      if(tail == null)
      {
        tail = new Node<>(t, null);
        head.next = tail;
        return;
      }

      tail.next = new Node<>(t,null);
      tail = tail.next;
   }

   @Override
   public Iterator<T> iterator()
   {
       return new ListIterator<>(this);
   }

   class ListIterator<T> implements Iterator<T>
   {

      private Node<T> currentNode;

      ListIterator(LinkedList<T> linkedList)
      {
          currentNode = linkedList.head;
      }

      @Override
      public boolean hasNext()
      {
         return currentNode != null;
      }

      @Override
      public T next()
      {
         if(!hasNext())
         {
            return null;
         }

         Node<T> nextNode = currentNode;

         currentNode = currentNode.next;

         return nextNode.value;
      }

   }

   public static void main(String[] args)
   {
      System.out.println("Hello LinkedList");

      LinkedList<Integer> linkedList = new LinkedList<>();

      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);
      linkedList.add(4);
      linkedList.add(5); 

      System.out.println("\n\n");
      for(int i:linkedList)
      {
         System.out.print(" " + i);
      }
      System.out.println("\n\n");

      System.out.println("\n\n");
      for(int i:linkedList)
      {
         System.out.print(" " + i);
      }
      System.out.println("\n\n");

   }

}
