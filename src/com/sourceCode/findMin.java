package com.sourceCode;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,78};
        int min = Integer.MAX_VALUE;

        for(int e:arr){
            if(e<min){
              min = e;
            }
        }
        System.out.println(min);
    }
}
