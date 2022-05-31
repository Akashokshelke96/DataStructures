package com.sourceCode.recursion;

public class RecursiveFactorial {
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }

        int factorialNM1 = calcfactorial(n-1);
        int factorialN = n * factorialNM1;
        return factorialN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcfactorial(n));
    }
}
