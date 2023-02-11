package com.company;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println(detectCycle(first));

    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head.next;
        ListNode helper = head;

        while (curr != null) {
            if (curr.next == head) {
                return head;
            }
            if (curr.next == curr) {
                return curr;
            }
            while (helper.next != curr) {
                if (helper == curr.next) {
                    return helper;
                }
                helper = helper.next;
            }
            helper = head;
            curr = curr.next;
        }

        return null;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
