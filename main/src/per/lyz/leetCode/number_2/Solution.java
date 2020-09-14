package per.lyz.leetCode.number_2;

public class Solution {
    public static void main(String[] args){
        int in = -123;       // int是32位，有符号的以二进制补码表示的整数
        int out = reverse(in);
        System.out.println("out:"+out);
    }
    public static int reverse(int x){
        int flag = 0;   //0-正数，1-负数
        if (x < 0){
            x = -x;
            flag = 1;
        }
        if (x==0)
            return 0;
        int n;       //n-位数
        int wei = x;
        for(n=0; wei >0;n++){
            wei /= 10;
        }
        //处理只有一位的情况
        if(n==1){
            if(flag==1)
                x = -x;
            return x;
        }
        //处理多位
        int[] keys = new int[n];
        for(int i=n;i>0;i--){
            keys[i-1] = (int) (x/(Math.pow(10,(i-1))));
            x = (int) (x - keys[i-1]*(Math.pow(10,(i-1))));
        }
        int out = 0;
        for(int i=0;i<keys.length;i++){
            int m = (int)(keys[i]*(Math.pow(10,(n-1-i))));
            out +=m;
        }
        if(flag==0 && out<0)
            return 0;
        else if(flag==1){
            if(out<=(Math.pow(2,31)-1)&&out>=(Math.pow(2,-31)-1)){
                out = -out;
            }
            else
                return 0;
        }
        return out;
    }
}
