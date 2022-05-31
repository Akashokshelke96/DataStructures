package com.sourceCode.recursion;

public class RecursiveFibonacci {
    public static void printFib(int a, int b, int n){
        if(n==0){ //base case
            return;
        }
        int c = a + b; //calculating next Term
        System.out.println(c);
         printFib(b,c,n-1); //to get the next term we subtract 1;
    }
    public static void main(String[] args) {
        int a = 0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        int n = 30;
        printFib(a,b,n-2); //n-2 because we already printed 0 and 1.
    }
}
