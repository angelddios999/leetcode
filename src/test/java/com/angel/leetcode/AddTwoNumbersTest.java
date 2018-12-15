package com.angel.leetcode;

import org.junit.Test;

public class AddTwoNumbersTest {

    private ListNode getListNode(int[] numbers) {
        ListNode listNode = new ListNode(numbers[0]);

        ListNode tempNode = listNode;
        for(int i = 1; i < numbers.length; i++) {
            tempNode.next = new ListNode(numbers[i]);
            tempNode = tempNode.next;
        }

        return  listNode;
    }

    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers atn = new AddTwoNumbers();
        int[] input1 = new int[]{2,4,3};
        int[] input2 = new int[]{5,6,4};
        ListNode ln1 = getListNode(input1);
        ListNode ln2 = getListNode(input2);
        ListNode result = atn.addTwoNumbers(ln1, ln2);
        System.out.println(result);
    }
}