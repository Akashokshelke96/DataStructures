package com.sourceCode;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2); //ignores the decimal;
        int temp; //empty variable to temporary store the replaced number

        for(int i=0;i<n;i++){
            //swapping a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for(int element:arr){
            System.out.println(element);
        }
    }
}
