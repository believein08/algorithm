package com.itfish.Q22IsPopOrder;

import java.util.LinkedList;

/**
 * Created by zhangyu on 2016/8/18.
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        LinkedList<Integer> stack=new LinkedList<>();
        int j=0;
        int i=0;
        while(i<popA.length&&j<pushA.length){
            while(stack.isEmpty()||stack.peek()!=popA[i]){
                stack.push(pushA[j++]);

            }
            stack.pop();
        }
    }
}
