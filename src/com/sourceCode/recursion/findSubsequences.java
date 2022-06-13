package com.sourceCode.recursion;

public class findSubsequences {

    public static void subsequences(String str, int idx,String newString){
    //baseCase
        if(idx == str.length()-1) {
            System.out.println(newString);
        return;

        }
            char currChar = str.charAt(idx);
        //calling two choices weather ot print the char or not.

        //joins the newString
        subsequences(str, idx+1, newString + currChar);

        //doesnt join the newString
        subsequences(str, idx+1, newString);
        }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
    }
}
