package com.itfish.chapter1String;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by zhangyu on 2016/7/20.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.next();
            char[] c=s.toCharArray();
            leftRotateString(c,c.length,3);
            System.out.println(c);
        }

    }

    /**
     *
     * @param s 字符数组
     * @param from
     * @param to
     */
    public static void reverseString(char[] s,int from,int to){
        while(from<to){
            char temp=s[from];
            s[from++]=s[to];
            s[to--]=temp;
        }
    }

    /**
     *
     * @param s
     * @param len 数组长度
     * @param move 移动前几个字母
     */
    public static void leftRotateString(char[] s,int len,int move){
        move%=len;
        reverseString(s,0,move-1);
        reverseString(s,move,len-1);
        reverseString(s,0,len-1);
    }
}
