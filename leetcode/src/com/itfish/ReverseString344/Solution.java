package com.itfish.ReverseString344;

/**
 * Created by zhangyu on 2016/7/20.
 */
public class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.reverseString("hello"));
    }
    /**
     * 直接交换就可以了
     * @param s
     * @return
     */
    public String reverseString(String s) {
        char[] c=s.toCharArray();
        int from=0;
        int to=c.length-1;
        while(from<to){
            char t=c[from];
            c[from++]=c[to];
            c[to--]=t;
        }
        return String.valueOf(c);

    }
}
