package com.itfish.Q14ReorderOddEven;

/**
 * Created by zhangyu on 2016/8/17.
 */
public class Solution {
    public void reorderOddEven(int[] array){
        int i=0,j=array.length-1;
        while(i<j){
            while(i<j&&array[j]%2==0){
                j--;
            }
            while(i<j&&array[i]%2==1){
                i++;
            }
            if(i<j){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
}
