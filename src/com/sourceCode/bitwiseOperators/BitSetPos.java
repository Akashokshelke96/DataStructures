package com.sourceCode.bitwiseOperators;

import org.w3c.dom.ls.LSOutput;

public class BitSetPos {
    public static void main(String[] args) {


        int n = 5;//bitwise position 0101;
        int pos = 1;
        int bitmask = 1 << pos; // 0010

        int newNumber = bitmask | n; /// after OR operation:  0111
        System.out.println(newNumber); //output will be 7
    }
}
