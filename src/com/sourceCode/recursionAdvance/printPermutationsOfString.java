package com.sourceCode.recursionAdvance;

public class printPermutationsOfString {

    public static void printPermutation(String str,String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0 ; i< str.length(); i++){
            char currChar = str.charAt(i);
            //i=0;"abc" -> "abc";   //"a"                //"bc"
            //i=1;"abc" -> "acb";   //"a"                //"ac"

            String newString = str.substring(0,i) + str.substring(i+1);
                                                    //a+c    +   b
            printPermutation(newString,permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        printPermutation(str,"");
    }
}
