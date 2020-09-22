package pers.lyz.leetCode.number_9;

public class Solution {
    public static void main(String[] args){
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        for(int i=0;i<removeElement(nums, val)-1;i++) {
            System.out.println(nums[i]);
        }
    }
    private static int removeElement(int[] nums, int val) {
        int i =0;
        for (int j=0;j< nums.length;j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
