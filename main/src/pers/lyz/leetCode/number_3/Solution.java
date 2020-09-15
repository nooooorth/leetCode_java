package pers.lyz.leetCode.number_3;


public class Solution {
    public static void main(String[] args){
        int in=-121;
        boolean out = test(in);
        System.out.println("结果："+out);
    }
    public static boolean test(int x){
        if(x < 0)
            return false;
        String in = String.valueOf(x);
        String re = new StringBuffer(in).reverse().toString();

        return in.equals(re);
    }
}
