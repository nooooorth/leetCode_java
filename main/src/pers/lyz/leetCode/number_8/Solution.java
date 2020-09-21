package pers.lyz.leetCode.number_8;

public class Solution {
    public static void main(String[] agrs){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        for(int i=0;i<len;i++)
            System.out.println(nums[i]);
    }
    public static int removeDuplicates(int[] nums){
        /**
         * @nums: 数组
         * 解法：有序数组，若挨着的两个值不同则将其移到后一位
         */
        int count = 1;
        int i=0;
        while (i < nums.length -1){
            if(nums[i] != nums[i+1]){
                nums[count] = nums[i+1];
                count ++;
            }
            i += 1;
        }
        return count;
    }
}
