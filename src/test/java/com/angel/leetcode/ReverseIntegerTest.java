package com.angel.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void testReverse1() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(321, reverseInteger.reverse(123));
    }
    @Test
    public void testReverse2() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(-321, reverseInteger.reverse(-123));
    }
    @Test
    public void testReverse3() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(21, reverseInteger.reverse(120));
    }
    @Test
    public void testReverse4() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(0, reverseInteger.reverse(1534236469));
    }
}
