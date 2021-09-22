package com.myleetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.myleetcode.ThreeSum;
import java.util.List;
import java.util.ArrayList;

/**
  * <h1>TestThreeSum</h1>
  * Test class for performing JUnit Test cases for ThreeSum question
  * <p> Implementation for JUnit Test cases Bag for ThreeSum qn from leetcode
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-09-22
  */


public class TestThreeSum
{
    @Test
    public void testThreeSum()
    {

        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> actual = threeSum.threeSum(nums);

        System.out.println("ACTUAL " + actual);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1,0,1));
        expected.add(List.of(-1,-1,2));

        assertTrue((expected.size() == actual.size()) &&
                    expected.containsAll(actual) &&
                    actual.containsAll(expected));
    }
}
