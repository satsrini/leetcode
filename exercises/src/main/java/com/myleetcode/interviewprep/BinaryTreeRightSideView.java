package com.myleetcode.interviewprep;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * <h1>BinaryTreeRightSideView.java</h1>
 * This class implements BinaryTreeRightSideView solution using BreadthFirstSearch algorithm
 * <p> BinaryTreeRightSideView qn can be found in https://leetcode.com/problems/binary-tree-right-side-view/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-12
 */


public class BinaryTreeRightSideView
{

   public BinaryTreeRightSideView(){}


   public List<Integer> rightSideView(TreeNode root)
   {
      List<Integer> result = new ArrayList<>();
      
      Queue<Integer> queue = new ArrayDeque<>();

      return result;
   }

   private void bfs(List<Integer> list, Queue<Integer> queue, TreeNode node)
   {

   }

   private class TreeNode
   {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(){}
     
     TreeNode(int val)
     {
        this.val = val;
     }

     TreeNode(int val, TreeNode left, TreeNode right)
     {
        this.val = val;
        this.left = left;
        this.right = right;
     }
     
   }

}
