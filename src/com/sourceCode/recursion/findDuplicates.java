package com.sourceCode.recursion;

public class findDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str,int idx,String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a'] == true){
            removeDuplicates(str,idx+1,newString);
        }
        else{
            newString += currentChar;
            map[currentChar- 'a'] = true;
            removeDuplicates(str, idx, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccdaadad";
        removeDuplicates(str, 0, "");
    }
}
