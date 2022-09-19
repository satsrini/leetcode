package com.myleetcode.interviewprep.dsa;

public class Node<T>
{

   public T t;
   public Node<T> next;

   public Node(T t, Node<T> next)
   {
      this.t = t;
      this.next = next;
   }

}
