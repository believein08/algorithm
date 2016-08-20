package com.itfish.Q26CloneList;

import com.itfish.myPublic.RandomListNode;

/**
 * Created by zhangyu on 2016/8/19.
 * //未完成，后面做
 */
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode head=new RandomListNode(0);
        head.next=pHead;
        RandomListNode p=head.next;
        return head;

    }
}
