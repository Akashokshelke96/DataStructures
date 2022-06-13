package com.sourceCode.recursion;

public class printKeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i = 0 ;i < mapping.length(); i++){
            printCombination(str,idx+1,combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        //  tc = O(4^n);
        //print the possible combination of input number by format of keypad;
        String str ="23";
        printCombination(str,0,"");
    }
}
