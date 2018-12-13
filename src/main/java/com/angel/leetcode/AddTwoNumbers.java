package com.angel.leetcode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number1 = Integer.valueOf(listNodeToString(l1));
        int number2 = Integer.valueOf(listNodeToString(l2));
        int sum = number1 + number2;
        return numberToNode(sum);
    }

    private String listNodeToString(ListNode ln) {
        StringBuilder sb = new StringBuilder();
        ListNode node = ln;

        while(node != null) {
            sb.append(node.val);
            node = node.next;
        }

        return sb.toString();
    }

    private ListNode numberToNode(int number) {
        String numberToString = String.valueOf(number);
        int length = numberToString.length();
        ListNode node = new ListNode(Integer.valueOf(numberToString.charAt(length - 1)));

        ListNode currentNode = node.next;
        for(int i = length - 2; i >= 0; i--) {
            currentNode = new ListNode(Integer.valueOf(numberToString.charAt(i)));
            currentNode = currentNode.next;
        }

        return node;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
