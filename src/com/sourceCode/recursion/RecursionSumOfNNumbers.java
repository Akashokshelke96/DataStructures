package com.sourceCode.recursion;

public class RecursionSumOfNNumbers {
    public static void sumN(int i,int n ,int sum){// where n is the number upto which we have to add,,,i=first element to start from

        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumN(i+1,n,sum);

    }
    public static void main(String[] args) {
        int n = 5;
        sumN(1,n,0);
    }

}
