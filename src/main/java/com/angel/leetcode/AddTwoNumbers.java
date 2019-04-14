package com.angel.leetcode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Val = l1 != null ? l1.val : 0;
        int l2Val = l2 != null ? l2.val : 0;
        int sum = l1Val + l2Val;
        boolean carriage = sum > 9;
        ListNode node = new ListNode(sum % 10);

        if(l1 != null && l1.next != null) {
            if(carriage) {
                l1.next.val++;
            }
            node.next = addTwoNumbers(l1.next, l2 != null ? l2.next : null);
        } else if(l2 != null && l2.next != null) {
            if(carriage) {
                l2.next.val++;
            }
            node.next = addTwoNumbers(l1 != null ? l1.next : null, l2.next);
        } else if(carriage){
            ListNode carriageNode = new ListNode(1);
            node.next = carriageNode;
        }

        return node;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
