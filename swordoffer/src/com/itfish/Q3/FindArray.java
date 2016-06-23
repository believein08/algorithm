package com.itfish.Q3;

/**
 * Created by Test on 2016/6/23.
 */
public class FindArray {
    public static void main(String[] args) {
        int a[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(a,7));
    }
    public static boolean find(int [][]array,int target){
        int i=array[0].length-1;
        int j=0;
        while(i>-1&&j<array.length){
            if(array[i][j]==target)
                return true;
            else if(array[i][j]>target)
                i--;
            else{
                j++;
            }
        }
        return false;
    }
}
