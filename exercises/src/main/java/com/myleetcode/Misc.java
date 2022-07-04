package com.myleetcode;

import java.util.Stack;

/**
 * <h1>Misc.java</h1>
 * This class is for doing miscellaneous programming
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-04
 */

public class Misc
{
 
   public Misc()
   {

   }

   /*public static void main(String[] args)
   {

      int x = -85917;
      System.out.println("Should be 85917 " + Math.abs(x));
   }*/

   public static void main(String[] args)
   {

      Stack<Integer> stack = new Stack<>();

      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);

      int size = stack.size();

      for(int i = 0; i < size; i++)
      {
         System.out.println(stack.pop());
      }
     
   }




}
