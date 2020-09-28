package pers.lyz.leetCode.number_12;

public class Solution {
    public static void main(String[] args){
        int key = 6;
        System.out.println(countAndSay(key));
    }
    public static String countAndSay(int n){
        //递归终止条件
        if(n==1){
            return "1";
        }
        StringBuffer res = new StringBuffer();
        //拿到上一层的字符
        String str = countAndSay(n-1);
        int length = str.length();
        //开始指针为0
        int start = 0;
        //注意其实条件要和下面统一
        for(int i=1;i<length+1;i++){
            if(i==length){
                res.append(i-start).append(str.charAt(start));
            } else if(str.charAt(i) != str.charAt(start)){
                res.append(i -start).append(str.charAt(start));
                start = i;
            }
        }

        return res.toString();
    }
}
