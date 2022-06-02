package com.sourceCode.recursion;

public class CalculateStackHeight {
    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int calc_powerNm1 = calcPower(x,n-1); // calculating power for n-1
        int calc_powerN = x * calc_powerNm1; //power of n * power of n-1
        return calc_powerN;
    }
    public static void main(String[] args) {
        int x = 2 , n = 5;
        System.out.println(calcPower(x,n));
    }
}
