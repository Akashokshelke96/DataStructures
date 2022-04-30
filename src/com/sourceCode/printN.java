package com.sourceCode;

public class printN {
    public static void main(String[] args) {
        print(12);

    }

    public static void print(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("end of inner loop");
        }
        System.out.println("end of outer loop");
    }
}
