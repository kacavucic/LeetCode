package com.company;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(list1));

    }

    public static ListNode reverseList(ListNode list1) {
        ListNode list2 = null;
        while (list1 != null) {
            list2 = new ListNode(list1.val, list2);
            list1 = list1.next;
        }
        return list2;
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
