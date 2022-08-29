package com.myleetcode.interviewprep;

/**
 * <h1>LengthOfLastWord.java</h1>
 * This class implements LengthOfLastWord solution.
 * <p> LengthOfLastWord qn can be found in https://leetcode.com/problems/length-of-last-word/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-29
 */

public class LengthOfLastWord
{

  public LengthOfLastWord(){}

  public int lengthOfLastWord(String s)
  {
    String[] result = s.split(" ");

    return result[result.length-1].length();
  }

  public static void main(String[] args)
  {
     System.out.println("Hello LengthOfLastWord");

     String s = "luffy is still joyboy";

     LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

     System.out.println("Should be 6: " + lengthOfLastWord.lengthOfLastWord(s));
  
  }

}
