package com.itfish.Q5;

import java.security.Principal;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Test on 2016/6/23.
 */
public class TailToHead {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        System.out.println(printListFromTailToHead(l1));
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        LinkedList<ListNode> stack=new LinkedList<>();

        while(listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;//千万不要把这一句丢了呀

        }
        ArrayList<Integer> arr=new ArrayList<>();
        while (!stack.isEmpty()){
            arr.add(stack.pop().val);
        }
        return arr;
    }
}
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
