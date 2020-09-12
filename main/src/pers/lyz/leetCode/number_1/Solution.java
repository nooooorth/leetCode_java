package pers.lyz.leetCode.number_1;

public class Solution {
    public static int[] twoSum(int[] nums, int target){
        int keys_1 = -1;
        int keys_2 = -1;
        outterloop:
        for(int i = 0; i< nums.length;i++){
            keys_1 = i;
            for(int j = i+1; j< nums.length; j++){
                if (nums[i]+nums[j]==target) {
                    keys_2 = j;
                    break outterloop;
                }
            }
        }
        return new int[]{keys_1, keys_2};
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
