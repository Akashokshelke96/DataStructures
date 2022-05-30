package com.sourceCode.bitwiseOperators;

public class BitClearPos {
    public static void main(String[] args) {


        int n = 5;//bitwise position 0101;
        int pos = 2;
        int bitmask = 1 << pos; // 0100b

        int newNumber = ~(bitmask);
        int finalNum = newNumber & n;
        System.out.println(finalNum);
    }
}
