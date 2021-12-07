package com.myleetcode;


/**
 * <h1>NumberOfOneBits</h1>
 * This class implements NumberOfOneBits solution
 * <p> NumberOfOneBits qn can be found in https://leetcode.com/problems/number-of-1-bits/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2021-12-06
 */


public class NumberOfOneBits
{

    public NumberOfOneBits()
    {

    }

    public int hammingWeight(int n)
    {
        return (n != 0) ? (n&1) + hammingWeight(n>>>1):0;
    }

    public static void main(String[] args)
    {
        System.out.println(new NumberOfOneBits().hammingWeight(11));
    }
}
