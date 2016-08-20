package com.itfish.Q22IsPopOrder;

import java.util.LinkedList;

/**
 * Created by zhangyu on 2016/8/18.
 */
public class Solution {
    public static void main(String[] args) {
        int[] pushA={1,2,3,4,5};
        int[] popA={4,5,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int i=0;
        int j=0;
        LinkedList<Integer> stack=new LinkedList();
        while(j<popA.length&&i<=pushA.length){
            if(stack.isEmpty()||stack.peek()!=popA[j]){
                if(i==pushA.length){
                    break;
                }
                stack.push(pushA[i]);
                i++;
            }
            if(stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
