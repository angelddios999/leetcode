package com.angel.leetcode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger number1 = listNodeToInt(l1);
        BigInteger number2 = listNodeToInt(l2);
        BigInteger sum = number1.add(number2);
        return numberToNode(sum);
    }

    private BigInteger listNodeToInt(ListNode ln) {
        StringBuilder sb = new StringBuilder();
        ListNode node = ln;

        while(node != null) {
            sb.append(node.val);
            node = node.next;
        }
        return new BigInteger(sb.reverse().toString());
    }

    private ListNode numberToNode(BigInteger number) {
        String numberToString = new StringBuilder(String.valueOf(number)).reverse().toString();

        int[] numbers = new int[numberToString.length()];
        for(int i = 0; i < numberToString.length(); i++) {
            numbers[i] = Integer.valueOf(Character.toString(numberToString.charAt(i)));
        }

        ListNode listNode = new ListNode(numbers[0]);

        ListNode tempNode = listNode;
        for(int i = 1; i < numbers.length; i++) {
            tempNode.next = new ListNode(numbers[i]);
            tempNode = tempNode.next;
        }

        return  listNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
