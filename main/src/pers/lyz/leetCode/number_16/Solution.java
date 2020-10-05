package pers.lyz.leetCode.number_16;

public class Solution{
	public static void main(String[] args){
		String a ="1",b="1011";
		System.out.println(addBinary(a,b));
	}
	private static String addBinary(String a, String b) {
		return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
	}

}