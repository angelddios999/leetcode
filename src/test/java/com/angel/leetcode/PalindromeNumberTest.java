package com.angel.leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PalindromeNumberTest {
    @Test
    public void testPalindromeNumber1() {
        PalindromeNumber pn = new PalindromeNumber();
        assertThat(pn.isPalindrome(121), is(true));
    }
    @Test
    public void testPalindromeNumber2() {
        PalindromeNumber pn = new PalindromeNumber();
        assertThat(pn.isPalindrome(-121), is(false));
    }
    @Test
    public void testPalindromeNumber3() {
        PalindromeNumber pn = new PalindromeNumber();
        assertThat(pn.isPalindrome(10), is(false));
    }
    @Test
    public void testPalindromeNumber4() {
        PalindromeNumber pn = new PalindromeNumber();
        assertThat(pn.isPalindrome(1000021), is(false));
    }
    @Test
    public void testPalindromeNumber5() {
        PalindromeNumber pn = new PalindromeNumber();
        assertThat(pn.isPalindrome(313), is(true));
    }
}
