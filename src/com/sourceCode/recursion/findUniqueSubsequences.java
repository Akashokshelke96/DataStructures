package com.sourceCode.recursion;

import javax.swing.*;
import java.util.HashSet;

public class findUniqueSubsequences {
    public static void findUnqSubsequence(String str, int idx, String combination, HashSet set){
            if(idx == str.length()){
            if(set.contains(combination)){
                return;
            }
            else{
                System.out.println(combination);
                set.add(combination);
                return;
            }
        }
        char currChar = str.charAt(idx);


        //recursion for both to add the character in sequence or not
        findUnqSubsequence(str,idx+1,combination+currChar,set);

        findUnqSubsequence(str,idx+1,combination,set);
    }

    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet();
        findUnqSubsequence(str,0,"",set);
    }
}
