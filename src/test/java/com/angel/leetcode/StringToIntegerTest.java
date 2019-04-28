package com.angel.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {
    @Test
    public void testMyAtoi1() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(42, stoi.myAtoi("42"));
    }
    @Test
    public void testMyAtoi2() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(-42, stoi.myAtoi("-42"));
    }
    @Test
    public void testMyAtoi3() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(4193, stoi.myAtoi("4193 with words"));
    }
    @Test
    public void testMyAtoi4() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(0, stoi.myAtoi("words and 987"));
    }
    @Test
    public void testMyAtoi5() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(-2147483648, stoi.myAtoi("-91283472332"));
    }
    @Test
    public void testMyAtoi6() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(-2147483647, stoi.myAtoi("-2147483647"));
    }
    @Test
    public void testMyAtoi7() {
        StringToInteger stoi = new StringToInteger();
        Assert.assertEquals(-5, stoi.myAtoi("-5-"));
    }
}
