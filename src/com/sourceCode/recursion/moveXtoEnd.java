package com.sourceCode.recursion;

public class moveXtoEnd {
    public static void moveX(String str, int idx, int count,String newString) {
//TIME COMPLEXITY O(N)
        if(idx == str.length()){//base Case
            for(int i = 0; i< count ; i++){
                newString+= 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveX(str, idx+1, count, newString);
        }
        else{
            newString += currChar;
            moveX(str, idx+1, count, newString);
        }

    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveX(str,0,0,"");
    }
}
