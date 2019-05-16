package com.angel.leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RegExMatchingTest {
    @Test
    public void testRegExMatching1() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aa", "a"), is(false));
    }
    @Test
    public void testRegExMatching2() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aa", "a*"), is(true));
    }
    @Test
    public void testRegExMatching3() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("ab", ".*"), is(true));
    }
    @Test
    public void testRegExMatching4() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aab", "c*a*b"), is(true));
    }
    @Test
    public void testRegExMatching5() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("mississippi", "mis*is*p*."), is(false));
    }
    @Test
    public void testRegExMatching6() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("ab", ".*c"), is(false));
    }
    @Test
    public void testRegExMatching7() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aaa", "a*a"), is(true));
    }
    @Test
    public void testRegExMatching8() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("", ".*"), is(true));
    }
    @Test
    public void testRegExMatching9() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aaa", "aaaa"), is(false));
    }
    @Test
    public void testRegExMatching10() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aaa", "ab*a*c*a"), is(true));
    }
    @Test
    public void testRegExMatching11() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("a", ".*..a*"), is(false));
    }
    @Test
    public void testRegExMatching12() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("bbbba", ".*a*a"), is(true));
    }
    @Test
    public void testRegExMatching13() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("aaaaaaaab", "a*b"), is(true));
    }
    @Test
    public void testRegExMatching14() {
        RegExMatching rxm = new RegExMatching();
        assertThat(rxm.isMatch("ab", ".*.."), is(true));
    }
}
