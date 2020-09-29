package pers.lyz.leetCode.number_14;

public class Solution {
    public static void main(String[] args){
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }
    private static int lengthOfLastWord(String s){
        if (s == null || s.length()==0)
            return 0;
        int count = 0;
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ') {
                if(count ==0)
                    continue;;
                break;
            }
            count++;
        }
        return count;
    }
}
