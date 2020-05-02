package com;

import java.util.Random;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    public void printListNode(ListNode head){
        while (head != null){
            System.out.print(head.val);
            if (head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    //头插法建立单链表
    public ListNode tailInsert(int len){

        ListNode head = null;
        ListNode current = head;
        ListNode node = current;

        Random r = new Random();
        for (int i = 0; i < len; i++) {
            int val = r.nextInt(50);
            node = new ListNode(val);
            if (head == null){//判断头节点是否为第一次赋值
                head = node;
                current = node;
            }else {
                current.next = node;
                current = node;
            }
        }
        return head;
    }
}
