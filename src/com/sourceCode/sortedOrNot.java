package com.sourceCode;

public class sortedOrNot {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {2,3,5,8,3,68,9,6,4,66};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted =false;
                break;
            }
        }
        if(isSorted){
            System.out.println("this is sorted array");
        }
        else{
            System.out.println("array " +
                    "" +
                    "is not sorted");
        }

    }
}
