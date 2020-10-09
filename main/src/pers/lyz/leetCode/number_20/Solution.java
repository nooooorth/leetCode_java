package pers.lyz.leetCode.number_20;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args){
		int[] nums1 = new int[]{1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = new int[]{2,5,6};
		int n = 3;
		merge(nums1, m, nums2 , n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n){
		System.arraycopy(nums2,0, nums1,m,n);
		Arrays.sort(nums1);
		for(int a : nums1)
			System.out.println(a);
	}
}
