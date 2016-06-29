package com.itfish.Q8mindigit;

/**
 * Created by zhangyu on 2016/6/27.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int i=0;
        int j=array.length;
        int mid=i;
        while (i<=j){
            if(j-i==1){

                break;
            }
            mid=(i+j)/2;
            if(array[mid]<=array[i]){
                i=mid;
            }
            else if(array[mid]>=array[j]){
                j=mid;
            }

        }

        return array[mid];

    }
}
