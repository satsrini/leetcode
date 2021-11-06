package com.myleetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <h1>LongestSequence</h1>
 * This class implements LongestSequence solution
 * <p> Longest Sequence qn can be found in 
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * 128
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2021-11-06
 */


public class LongestSequence
{
    public LongestSequence()
    {

    }

    public int longestConsecutive(int[] nums) 
    {
       if(nums == null || nums.length == 0)
       {
          return 0;
       }

       Queue<Integer> pq = new PriorityQueue<>(nums.length);

       for(int k:nums)
       {
         pq.add(k);
       } 

       int longestSeq = 0;
       int currentSeq = 1;
       int prev = pq.peek();

       while(!pq.isEmpty())
       {

          if(pq.peek() - prev > 1)
          {
             longestSeq = Math.max(longestSeq,currentSeq);
             currentSeq = 1;
          }else
          if(pq.peek() - prev == 1) // handling duplicate
          {
             currentSeq++;
          }

          prev = pq.poll();

       }

       longestSeq = Math.max(longestSeq,currentSeq);

       return longestSeq;

    }

}
