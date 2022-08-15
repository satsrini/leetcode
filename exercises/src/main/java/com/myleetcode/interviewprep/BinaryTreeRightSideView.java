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
 * @since   2022-08-15
 */


public class BinaryTreeRightSideView
{

   public BinaryTreeRightSideView(){}


   public List<Integer> rightSideView(TreeNode root)
   {
      List<Integer> result = new ArrayList<>();
      
      bfs(result,root);

      return result;
   }

   private void bfs(List<Integer> list,TreeNode node)
   {
       Queue<TreeNode> queue = new ArrayDeque<>();

       queue.add(node);

       while(queue.size() > 0)
       {
          int rowLength = queue.size();
          list.add(queue.peek().val);

          for(int i = 0; i < rowLength; i++)
          {
             TreeNode childNode = queue.poll();

             if(childNode.right != null)
             {
                queue.add(childNode.right);
             }

             if(childNode.left != null)
             {
               queue.add(childNode.left);
             }

          }
       }

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
