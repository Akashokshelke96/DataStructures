package com.sourceCode.recursion;

public class StackHeightLogN {
    public static int calcStackHeight(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n % 2 == 0){
            return calcStackHeight(x,n/2) * calcStackHeight(x,n/2);
        }
        else{
            return calcStackHeight(x,n/2) * calcStackHeight(x,n/2) * x;
        }
    }
    public static void main(String[] args) {

        int x = 2;
        int n = 5;
        System.out.println(calcStackHeight(x,n));
    }
}
