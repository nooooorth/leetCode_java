package pers.lyz.leetCode.number_15;

public class Solution{
	public static void main(String[] args){
		int[] nums = new int[] {9,9};
		for(int a : plusOne(nums))
			System.out.println(a);
	}
	private static int[] plusOne(int[] digits){
		for(int i=digits.length-1;i>=0;i--){
			digits[i] += 1;
			if(digits[i]==10){
				digits[i] = 0;
				if(digits[0]==0){
					int[] keys = new int[digits.length+1];
					keys[0] = 1;
					System.arraycopy(digits, 0, keys, 1, keys.length - 1);
					return keys;
				}
			}else
				break;
		}

		return digits;
	}
}