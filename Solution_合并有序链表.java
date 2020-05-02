package com;

public class Solution_合并有序链表 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode newHead = null;
        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else {
            if (l1.val <= l2.val){
                newHead = l1;
                newHead.next = mergeTwoLists(l1.next, l2);
            }else {
                newHead = l2;
                newHead.next = mergeTwoLists(l1, l2.next);
            }
        }
        return newHead;

    }

    public static ListNode mergeTwoListsOrder(ListNode l1, ListNode l2){

        ListNode newHead = null;
        ListNode newNext = null;

        if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        } else {

            if (l1.val <= l2.val){
                newHead = l1;
                l1 = l1.next;
            } else {
                newHead = l2;
                l2 = l2.next;
            }
            newNext = newHead;
            while (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    newNext.next = l1;
                    l1 = l1.next;
                } else {
                    newNext.next = l2;
                    l2 = l2.next;
                }
                newNext = newNext.next;
            }
            if (l1 == null){
                newNext.next = l2;
            } else if (l2 == null){
                newNext.next = l1;
            }
        }
        return newHead;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode listNode = new ListNode();
        listNode.printListNode(l1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        listNode.printListNode(l2);


//        ListNode head = listNode.tailInsert(10);
//        listNode.printListNode(head);

        ListNode newHead = mergeTwoListsOrder(l1, l2);
        listNode.printListNode(newHead);
    }
}
