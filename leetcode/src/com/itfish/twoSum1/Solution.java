package com.itfish.twoSum1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyu on 2016/8/11.
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        new Solution().twoSum(nums,3);
    }
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int want=target-nums[i];
            if(map.containsKey(want)){
                return new int[]{map.get(want),i};
            }
            map.put(nums[i],i);
        }
        throw new RuntimeException("未找到结果");
    }
}
