package com.itfish.addTwoNumbers;

import com.itfish.pub.ListNode;

/**
 * Created by zhangyu on 2016/8/11.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode res,p,q,cur;
        res=new ListNode(0);
        cur=res;
        p=l1;
        q=l2;
        int adding=0;
        while(p!=null||q!=null){
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=x+y+adding;
            cur.next=new ListNode(sum%10);
            adding=sum/10;
            if(p!=null)
                p=p.next;
            if(q!=null)
                q=q.next;
            cur=cur.next;
        }
        if(adding>0)
            cur.next=new ListNode(adding);
        return res.next;
    }
}
