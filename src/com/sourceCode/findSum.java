package com.sourceCode;

public class findSum {

    public static void main(String[] args) {
        System.out.println(findSum(12));
        System.out.println(findSum2(12));
}
    public static int findSum(int n){
        return n * (n+1)/2;
    }


    public static int findSum2(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
