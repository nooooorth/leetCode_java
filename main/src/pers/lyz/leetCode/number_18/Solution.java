package pers.lyz.leetCode.number_18;

public class Solution {
    public static void main(String[] args){
        int a = 9;
		System.out.println(climbStairs(a));
    }
    private static int climbStairs(int n){
        // 转移方程 和 边界条件 f(0)=1,f(1)=1
		int p=0,q=0,r=1;
		for(int i=1;i<=n;++i){
			p = q;
			q = r;
			r = p+q;
		}
		return r;
    }
}
