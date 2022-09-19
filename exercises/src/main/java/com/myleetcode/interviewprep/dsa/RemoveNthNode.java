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
       return null;
   }

   public static void main(String[] args)
   {
       System.out.println("Hello Remove Nth Node");
   }

   public class ListNode 
   {
 	int val;
 	ListNode next;
 	ListNode() {}
 	ListNode(int val) { this.val = val; }
 	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

}
