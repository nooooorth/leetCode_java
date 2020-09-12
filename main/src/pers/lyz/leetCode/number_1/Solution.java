package pers.lyz.leetCode.number_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i <nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i=0; i< nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }
    public static void main(String[] args){
        int[] nums = {3, 4, 5, 6, 7};
        int target = 9;
        int[] keys = twoSum(nums, target);
        for (int key : keys) {
            System.out.println(key);
        }
    }
}
