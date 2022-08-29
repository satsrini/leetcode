package com.myleetcode.interviewprep;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

/**
 * <h1>ValidParenthesis.java</h1>
 * This class implements ValidParenthesis solution.
 * <p> ValidParenthesis qn can be found in https://leetcode.com/problems/valid-parentheses/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-29
 */

public class ValidParenthesis
{

   private static Map<Character,Character> values = new HashMap<>();

   static
   {
      values.put('(',')');
      values.put('{','}');
      values.put('[',']');
   }

   public ValidParenthesis(){}

   public boolean isValid(String s)
   {

      if(s.length() == 1)
      {
         return false;
      }

      Stack<Character> stack = new Stack<>();

      char parenthesis;

      for(int i = 0; i < s.length(); i++)
      {
         parenthesis = s.charAt(i);
         if(parenthesis  == '(' || parenthesis  == '{' || parenthesis  == '[')
         {
            stack.push(parenthesis);
            continue;
         }

         if(stack.empty() || values.get(stack.pop()) != parenthesis)
         {
            return false;
         }

      }

      return stack.empty();
   }

   /*public static void main(String[] args)
   {
      System.out.println("Hello ValidParenthesis");

      String s = "()[]{}";
      ValidParenthesis validParenthesis = new ValidParenthesis();

     System.out.println("is Valid: true:  " + validParenthesis.isValid(s));

   }*/

   /*public static void main(String[] args)
   {
      System.out.println("Hello ValidParenthesis");

      String s = "(]";
      ValidParenthesis validParenthesis = new ValidParenthesis();

      System.out.println("not Valid:false  " + validParenthesis.isValid(s));

   }*/


   /*public static void main(String[] args)
   {
      System.out.println("Hello ValidParenthesis");

      String s = "((";
      ValidParenthesis validParenthesis = new ValidParenthesis();

      System.out.println("not Valid:false  " + validParenthesis.isValid(s));

   }*/

   public static void main(String[] args)
   {
      System.out.println("Hello ValidParenthesis");

      String s = "){";
      ValidParenthesis validParenthesis = new ValidParenthesis();

      System.out.println("not Valid:false  " + validParenthesis.isValid(s));

   }

}
