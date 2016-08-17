package com.itfish.Q13DeleteNode;

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
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        printList(l1);
        new Solution().deleteNode(l1,l1);
        printList(l1);


    }
    public static void printList(ListNode l){
        while(l!=null){
            System.out.print(l.value+"->");
            l=l.next;
        }
        System.out.println();
    }
    public void deleteNode(ListNode list,ListNode target){
        ListNode p=list;
        if(p==target&&p.next==null){
            list=null;

        }
        else if(target.next==null){
            while (p.next!=target&&p.next!=null){
                p=p.next;
            }
            if(p.next==null){
                throw new RuntimeException("要删除节点不存在");
            }else{
                p.next=target.next;
                target=null;

            }
        }
        else{
            ListNode q=target.next;
            target.value=q.value;
            target.next=q.next;
            q=null;

        }


    }
}
