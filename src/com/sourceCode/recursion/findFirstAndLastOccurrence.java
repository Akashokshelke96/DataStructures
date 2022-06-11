package com.sourceCode.recursion;

public class findFirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurrence(String str , int index , char element){ //index is the starting point, element is the one to be found
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findOccurrence(str,index+1,element);
    }

    public static void main(String[] args) {
        findOccurrence("abcaabbababdba",0,'a');
    }

    //find First and Last occurrence of an element in a String!!
}
