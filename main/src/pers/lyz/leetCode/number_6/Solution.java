package pers.lyz.leetCode.number_6;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(isValid(s));

    }
    private static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        //st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else {
                if((st.peek()=='['&&s.charAt(i)==']')||
                    (st.peek()=='{'&&s.charAt(i)=='}')||
                    (st.peek()=='('&&s.charAt(i)==')')){
                        st.pop();
            } else {
                    st.push(s.charAt(i));
                }
        }
    }
        return st.empty();
    }
}
