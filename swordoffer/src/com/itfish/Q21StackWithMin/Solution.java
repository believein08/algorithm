package com.itfish.Q21StackWithMin;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhangyu on 2016/8/18.
 */
public class Solution {

    int length=0;
    LinkedList<Integer> mystack=new LinkedList<>();
    LinkedList<Integer> myMin=new LinkedList<>();
    int min=0;
    public void push(int node) {
        mystack.push(node);
        if(length==0) {
            min=node;
            myMin.push(min);

        }else{
            if(node<min) {
                myMin.push(node);
                min=node;
            }else {
                myMin.push(min);
            }
        }
        length++;

    }

    public void pop() {
        myMin.pop();
        mystack.pop();
        length--;
    }

    public int top() {
        return mystack.peek();
    }

    public int min() {
        return myMin.peek();
    }
}


