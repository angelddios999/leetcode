package com.angel.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    @Test
    public void testConvert1() {
        ZigZagConversion zzc = new ZigZagConversion();
        Assert.assertEquals("AB", zzc.convert("AB", 1));
    }

    @Test
    public void testConvert2() {
        ZigZagConversion zzc = new ZigZagConversion();
        Assert.assertEquals("PYAIHRNAPLSIIG", zzc.convert("PAYPALISHIRING", 2));
    }

    @Test
    public void testConvert3() {
        ZigZagConversion zzc = new ZigZagConversion();
        Assert.assertEquals("PAHNAPLSIIGYIR", zzc.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void testConvert4() {
        ZigZagConversion zzc = new ZigZagConversion();
        Assert.assertEquals("PINALSIGYAHRPI", zzc.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void testConvert5() {
        ZigZagConversion zzc = new ZigZagConversion();
        Assert.assertEquals("ACB", zzc.convert("ABC", 2));
    }


}
