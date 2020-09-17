package pers.lyz.leetCode.number_5;

public class Solution {
    public static void main(String[] args){
        String[] a =new String[] {"flower","flow","flight"};
        System.out.println(find(a));
    }
    /**
     * @description: 纵向遍历
     * @param strs:字符串数组
     * @return str;
     * **/
    private static String find(String[] strs){
        if(strs == null || strs.length ==0) // 判断是否为空
            return "";
        int length = strs[0].length();      // 字符串数组中第一个字符串的长度
        int count = strs.length;            // 字符串数组长度计数器
        for(int i=0;i<length;i++){
            char c = strs[0].charAt(i);     //  取第一个字符
            for(int j=1;j<count;j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

}

