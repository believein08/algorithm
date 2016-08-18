package com.itfish.Q15findKthTiTail;

import com.itfish.myPublic.ListNode;

/**
 * Created by zhangyu on 2016/8/17.
 */
public class Solution {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(6);
        ListNode l7=new ListNode(7);
        ListNode l8=new ListNode(8);
        ListNode l9=new ListNode(9);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        l8.next=l9;

        System.out.print(new Solution().findKthToNode(l1,1).val);
    }
    public ListNode findKthToNode(ListNode list,int k){
        ListNode pre=list;
        ListNode beh=list;
        int i=0;
        for(i=0;i<k&&beh!=null;i++)
            beh=beh.next;
        if(i!=k){
            throw new RuntimeException("数组长度小于"+k);
        }
        while (beh!=null){
            beh=beh.next;
            pre=pre.next;
        }
        return pre;
    }
}
