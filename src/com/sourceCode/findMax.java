package com.sourceCode;

public class findMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,17};
        int l = arr.length;
        int max = 0;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("max is " + max);

    }
}
