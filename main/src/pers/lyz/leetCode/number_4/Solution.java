package pers.lyz.leetCode.number_4;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        String x = "MCMXCIV";
        System.out.println(romanToInt(x));

    }
    public static int romanToInt(String s){
        Map m = new HashMap();
        m.put("I",1);m.put("V",5);m.put("X",10);m.put("L",50);
        m.put("C",100);m.put("D",500);m.put("M",1000);
        m.put("0",0);
        char[] in_key = s.toCharArray();
        int count = 0;
        int sum =0;
        while (count < in_key.length-1){
            int count_1 = count+1;
            String middle = String.valueOf(in_key[count])+String.valueOf(in_key[count_1]);
            if(Objects.equals(middle, "IV")){
                sum += 4;
                in_key[count] = '0';
                in_key[count_1] = '0';
                count++;
            }
            else if(middle.equals("IX")){
                sum += 9;
                in_key[count] = '0';
                in_key[count_1] = '0';
                count++;
            }
            else if(Objects.equals(middle, "XL")){
                sum += 40;
                in_key[count] = '0';
                in_key[count_1] = '0';
                count++;
            }else if(Objects.equals(middle, "XC")){
                sum += 90;
                in_key[count] = '0';
                in_key[count_1] = '0';
                count++;
            }else if(Objects.equals(middle, "CD")){
                sum += 400;
                in_key[count] = '0';
                in_key[count_1] = '0';
                count++;
            }else if(Objects.equals(middle, "CM")){
                sum += 900;
                in_key[count] = '0';
                in_key[count_1] = '0';
                count++;
            }
            count++;
        }
        int[] number_key = new int[in_key.length];
        for (int i=0; i<in_key.length; i++) {
            number_key[i] = (int) m.get(String.valueOf(in_key[i]));
        }
        for(int i : number_key)
            sum += i;
        return sum;
    }
}
