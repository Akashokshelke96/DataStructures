package com.sourceCode.bitwiseOperators;

public class BitGetPos {
    public static void main(String[] args) {
        int n = 5;//bitwise position 0101;
        int pos = 2;
        int bitmask = 1<<pos; // 0100b

        if((bitmask & n)== 0){
            System.out.println("the index bit is ZERO");
        }
        else{
            System.out.println("Index bit is ONE");
        }

    }
}
