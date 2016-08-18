package com.itfish.myPublic;

import org.w3c.dom.ls.LSException;

/**
 * Created by zhangyu on 2016/8/17.
 */
public class ListNode {

    public static void main(String[] args) {

    }
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next=null;
    }
    public static void printList(ListNode l){
        while(l!=null){
            System.out.print(l.val +"->");
            l=l.next;
        }
        System.out.println();
    }
    public static ListNode createList(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode cur=head;

        for(int i=1;i<arr.length;i++){

            cur.next=new ListNode(arr[i]);
            cur=cur.next;
        }
        return head;
    }


}
