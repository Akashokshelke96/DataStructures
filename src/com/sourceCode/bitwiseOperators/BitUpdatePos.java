package com.sourceCode.bitwiseOperators;

import java.util.Scanner;

public class BitUpdatePos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //if oper = 1 -> use set & if oper = 0 -> use NOT with AND ;
        int n = 5;//bitwise position 0101;
        int pos = 1;

        if(oper ==1) {
            int bitmask = 1 << pos; // 0100
            int num = bitmask | n ;
            System.out.println(num);
        }
        else if(oper == 0){
            int bitmask = 1<< pos;
            int notBitmask = ~(bitmask);
            int num = notBitmask & n;
            System.out.println(num);
        }
    }
}
