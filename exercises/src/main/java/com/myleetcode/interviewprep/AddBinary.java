package com.myleetcode.interviewprep;

/**
 * <h1>AddBinary.java</h1>
 * This class implements AddBinary solution.
 * <p> AddBinary qn can be found in https://leetcode.com/problems/add-binary/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-30
 */
public class AddBinary
{

   public AddBinary(){}

   public String addBinary(String a, String b)
   {
      StringBuilder result = new StringBuilder();

      String l = a;
      String s = b;

      if(a.length() < b.length())
      {
         l = b;
         s = a;
      }
      
      int diff = l.length() - s.length();
      int c = 0;
      int m = 0;
      int n = 0;
      for(int i = l.length()-1; i >= 0; i-- )
      {
         m = Character.getNumericValue(l.charAt(i));
         n = 0;
         if(i < s.length()){
            n = Character.getNumericValue(s.charAt(i-diff));
         }

         if(m == 0 && n == 0)
         {
            result.append(c);
            c = 0;
         }else
         if(m == 1 && n ==1)
         {
            result.append(c);
            c = 1;
         }else // either m is 1 or n is 1
         {
            if(c==1)
            {
               result.append(0);
               c = 1;
            }else
            {
               result.append(1);
               c = 0;
            }
         }

      }


      if(c == 1)
      {
         result.append(c);
      }

      return result.reverse().toString();
   }

   public static void main(String[] args)
   {
      System.out.println("Hello AddBinary");

      AddBinary addBinary = new AddBinary();

      String a = "1010";
      String b = "1011";

      System.out.println("Should be 10101: " + addBinary.addBinary(a,b));
   }

}
