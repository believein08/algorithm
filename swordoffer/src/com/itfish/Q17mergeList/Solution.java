package com.itfish.Q17mergeList;

import com.itfish.myPublic.ListNode;

/**
 * Created by zhangyu on 2016/8/18.
 */
public class Solution {
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,5,6,7};
        int arr2[]=new int[]{4,5,8,9,10};
        ListNode list1=ListNode.createList(arr);
        ListNode list2=ListNode.createList(arr2);
        ListNode.printList(list1);
        ListNode.printList(new Solution().Merge(list1,list2));
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode p=list1;
        ListNode q=list2;
        ListNode head=new ListNode(0);
        ListNode current=head;
        while (p!=null&&q!=null){
            if(p.val<=q.val){
                current.next=p;
                current=current.next;
                p=p.next;
            }else{
                current.next=q;
                q=q.next;
                current=current.next;
            }
        }
        if(q!=null){
            current.next=q;

        }
        if(p!=null){
            current.next=p;
        }
        return head.next;

    }
}
