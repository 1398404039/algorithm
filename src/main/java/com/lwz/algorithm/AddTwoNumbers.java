package com.lwz.algorithm;

/*
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int resL1 = getIntValue(l1);
        int resL2 = getIntValue(l2);
        String result = String.valueOf(resL1 + resL2);

        int index = 1;
        int length = result.length();
        ListNode resNode = new ListNode(Integer.valueOf(result.substring(0,1)));
        while (index < length){
            ListNode item = new ListNode(Integer.valueOf(result.substring(index,index+1)));
            item.next = resNode;
            resNode = item;
            index ++;
        }
        return resNode;
    }

    public static int getIntValue(ListNode node){
        if(node == null){
            return 0;
        }
        ListNode item =node;
        int flag = 1;
        int result = 0;
        while (item != null){
            result = result + (item.val * flag);
            flag = flag * 10;
            item =item.next;
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
