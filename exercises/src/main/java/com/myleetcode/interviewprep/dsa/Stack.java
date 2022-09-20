package com.myleetcode.interviewprep.dsa;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>
{

   private Node<T> currentNode;
   private int N;

   public Stack()
   {
      N = 0;
   }

   public void push(T t)
   {
      Node<T> x = new Node<>(t,currentNode);
      currentNode = x;
      N++;
   }

   public T pop()
   {

     if(isEmpty())
     {
        return null;
     }

     Node<T> x = currentNode;
     currentNode = currentNode.next;
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
      return new StackIterator<>(this);
   }

   class StackIterator<T> implements Iterator<T>
   {

      private Node<T> nextNode;

      StackIterator(Stack<T> stack)
      {
         nextNode = stack.currentNode;
      }

      @Override
      public T next()
      {

         Node<T> x = nextNode;
         nextNode = nextNode.next;

         return x.value;
      }

      @Override
      public boolean hasNext()
      {
         return nextNode != null;
      }

   }

   /*public static void main(String[] args)
   {
      Stack<Integer> stack = new Stack<>();

      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);

      System.out.println("SIZE: " + stack.size());

      System.out.println("\n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");

      System.out.println("\n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");

      System.out.println("\n\n");

      int N = stack.size();
      for(int i = 0; i < N; i++)
      {
         System.out.print(" " + stack.pop());
      }

      System.out.println("\n\n");

      System.out.println("SIZE: " + stack.size());

      System.out.println("FINAL ITERATION \n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");


   }*/

   public static void main(String[] args)
   {
      Stack<Integer> stack = new Stack<>();

      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);

      System.out.println("SIZE: " + stack.size());

      System.out.println("\n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");

      System.out.println("\n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");

      System.out.println("\n\n");
      System.out.println("SIZE: " + stack.size());

      System.out.println("POPPING");
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println("SIZE: " + stack.size());

      System.out.println("\n\n");

      System.out.println("\n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");

      System.out.println("\n\n");

      System.out.println("SIZE: " + stack.size());

      System.out.println("PUSHONG");
      stack.push(6);
      stack.push(7);
      System.out.println("SIZE: " + stack.size());

      System.out.println("\n\n");

      System.out.println("\n\n");

      for(int i:stack)
      {
         System.out.print(" " + i);
      }

      System.out.println("\n\n");

      System.out.println("\n\n");



    }

}
