package pers.lyz.leetCode.number_11;

public class Solution {
    public static void main(String[] args){
        int[] nums = new int[] {1};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target){
        if(target<= nums[0])
            return 0;
        if(nums.length==1){
            if(target<=nums[0]){
                return 0;
            }else
                return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(target > nums[i] && target<=nums[i+1]){
                return i+1;
            }else if (target > nums[nums.length-1])
                return nums.length;
        }

        return 0;
    }
}
