package com.lwz.algorithm;

/*
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 * 你能尝试使用一趟扫描实现吗？
 */

public class RemoveNthFromEnd {
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next.next = new ListNode(7);
        ListNode nodes = removeNthFromEnd(node,5);
        System.out.println();
        while(nodes != null){
            System.out.print(nodes.val + "-->");
            nodes = nodes.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        // 打印初始链表
        ListNode nodes = head;
        while(nodes != null){
            System.out.print(nodes.val + "-->");
            nodes = nodes.next;
        }
        // 打印初始链表

        ListNode begin = head;
        ListNode temp = begin;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        ListNode end = temp;

        while(end.next != null){
            begin = begin.next;
            end = end.next;
        }
        begin.next = begin.next.next;
        // 打印最终链表
//        System.out.println();
//        while(head != null){
//            System.out.print(head.val + "-->");
//            head = head.next;
//        }
        // 打印最终链表

        return head;
    }

   static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}
