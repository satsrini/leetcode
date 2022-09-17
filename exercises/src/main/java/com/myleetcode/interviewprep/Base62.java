package com.myleetcode.interviewprep;

public class Base62
{


   private static String BASE_62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
   private static int BASE=62;
   public Base62(){}

   public String encode(long number)
   {
      StringBuilder result = new StringBuilder();

      while(number != 0)
      {
         result.append(BASE_62.charAt((int)(number%BASE)));
         number /= BASE;
      }

      return result.reverse().toString();
   }

   public long decode(String base64Number)
   {

      long result = 0;

      int N = base64Number.length();

      for(int i = N-1; i >= 0; i--)
      {
         int k = BASE_62.indexOf(base64Number.charAt(i));
         
         result += k*Math.pow(BASE,N-1-i);
      }

      return result;
   }
  


   /*public static void main(String[] args)
   {
      System.out.println("Hello BASE62");

      Base62 base62 = new Base62();

      System.out.println("Should be 9DU:  " + base62.encode(35432));

   }*/

   public static void main(String[] args)
   {
      System.out.println("Hello BASE62");

      Base62 base62 = new Base62();

      System.out.println("Should be 35432:  " + base62.decode("9DU"));

   }

}
