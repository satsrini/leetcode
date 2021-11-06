package com.myleetcode;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.myleetcode.LongestSequence;
import java.util.List;
import java.util.ArrayList;

/**
  * <h1>TestLongestSequence</h1>
  * Test class for performing JUnit Test cases for TestLongestSequence question
  * <p> Implementation for JUnit Test cases for TestLongestSequence qn from leetcode
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-11-06
  */


public class TestLongestSequence
{
    @Test
    public void testLongestSequence()
    {

        LongestSequence longestSequence = new LongestSequence();
        int[] nums = {100,4,200,1,3,2};

        assertEquals(Integer.valueOf(4),
            Integer.valueOf(longestSequence.longestConsecutive(nums)));

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};

        assertEquals(Integer.valueOf(9),
            Integer.valueOf(longestSequence.longestConsecutive(nums2)));

    }
}

