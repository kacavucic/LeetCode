package com.company;

public class MiddleoftheLinkedList {


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(list1));

    }

    public static ListNode middleNode(ListNode list1) {

        int nodes = count(list1);
        int middleNodeIndex = nodes / 2 + 1;
        for (int i = 1; i < middleNodeIndex; i++) {
            list1 = list1.next;
        }
        return list1;
    }

    private static int count(ListNode list1) {
        if (list1 == null) {
            return 0;
        }
        int count = 0;
        ListNode helper = list1;
        while (helper != null) {
            count++;
            helper = helper.next;
        }
        return count;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
