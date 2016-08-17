package com.itfish.myPublic;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * Created by zhangyu on 2016/8/17.
 */
public class ListNode {
    public ListNode(int value){
        this.value=value;
        this.next=null;
    }

    public int value;
    public ListNode next;

}
