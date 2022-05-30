package com.sourceCode.randomQuestions;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPower2(32));

    }

    static boolean isPower2(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
                n = n / 2;
            }
            return true;
        }
    }
