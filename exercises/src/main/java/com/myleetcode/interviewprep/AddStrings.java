package com.myleetcode.interviewprep;


public class AddStrings
{
   public AddStrings(){}

   public String addStrings(String num1, String num2)
   {

     int length1 = num1.length();
     int length2 = num2.length();
     int length = 0;

     int lengthDiff1 = 0;
     int lengthDiff2 = 0;

     if(length1 > length2)
     {
        length = length1;
        lengthDiff2 = length1-length2;
     }else
     {
        length = length2;
        lengthDiff1 = length2-length1;

     }


     int carry = 0;
     StringBuilder s = new StringBuilder();
     for(int i = length-1; i >= 0; i--)
     {
        int a1 = 0;

        if(i-lengthDiff1 >= 0)
        {
           a1 = Character.getNumericValue(num1.charAt(i-lengthDiff1));
        }

          
        int a2 = 0;
        if(i-lengthDiff2 >= 0)
        {
           a2 = Character.getNumericValue(num2.charAt(i-lengthDiff2)); 
        }


        s.append((a1+a2+carry)%10);
        carry = (a1+a2+carry)/10;

     }

     if(carry > 0)
     {
        s.append(carry);
     }

     return s.reverse().toString();
   }

   public static void main(String[] args)
   {
      System.out.println("Hello AddStrings");

      AddStrings addStrings = new AddStrings();
      String num1 = "456";
      String num2 = "77";
 
      System.out.println("Should be 533:   " + addStrings.addStrings(num1,num2));
   }


}
