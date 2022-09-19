package com.myleetcode.interviewprep.dsa;

/**
 * <h1>RemoveNthNode.java</h1>
 * This class implements RemoveNthNode solution.
 * <p> RemoveNthNode qn can be found in https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-09-19
 */

public class RemoveNthNode
{


   public RemoveNthNode(){}

   public ListNode solution(ListNode head, int n)
   {
       ListNode currentNode = head;

       if(head == null || head.next == null) // empty or just the head
       {
          return null;
       }

       int y = remove(currentNode, n);

       if(y == n) // case where sz is same as n
       {
          head = head.next;
       }

       return head;
   }

   private int remove(ListNode currentNode, int n)
   {

       if(currentNode.next == null) // arrived at the last node
       {
          return 1;
       }

       int x = 1 + remove(currentNode.next, n); // recursive calling

       if(x == n+1) // match found
       {
          currentNode.next = currentNode.next.next;
       }

       return x;

   }

   /*public static void main(String[] args)
   {
       System.out.println("Hello Remove Nth Node");

       ListNode fifth = new ListNode(5,null);
       ListNode fourth = new ListNode(4,fifth);
       ListNode third = new ListNode(3,fourth);
       ListNode second = new ListNode(2,third);
       ListNode first = new ListNode(1,second);

       ListNode current = first;

       System.out.println("\n\n");
       while(current != null)
       {
          System.out.print(" " + current.val);
          current = current.next;
       }
       System.out.println("\n\n");

       RemoveNthNode removeNthNode = new RemoveNthNode();

       first = removeNthNode.solution(first, 2);

       ListNode currentNode = first;

       System.out.println("\n\n");
       while(currentNode != null)
       {
          System.out.print(" " + currentNode.val);
          currentNode = currentNode.next;
       }
       System.out.println("\n\n");

   }*/

   public static void main(String[] args)
   {
       System.out.println("Hello Remove Nth Node");

       ListNode second = new ListNode(2,null);
       ListNode first = new ListNode(1,second);

       ListNode current = first;

       System.out.println("\n\n");
       while(current != null)
       {
          System.out.print(" " + current.val);
          current = current.next;
       }
       System.out.println("\n\n");

       RemoveNthNode removeNthNode = new RemoveNthNode();

       first = removeNthNode.solution(first, 2);

       ListNode currentNode = first;

       System.out.println("\n\n");

       System.out.println("\n\n");
       while(currentNode != null)
       {
          System.out.print(" " + currentNode.val);
          currentNode = currentNode.next;
       }
       System.out.println("\n\n");

   }

}
