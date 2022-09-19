package com.myleetcode.interviewprep.dsa;


public class LinkedList<T>
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



}
