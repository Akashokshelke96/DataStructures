package com.sourceCode.binarySearch;

public class findElement {
    public static void main(String[] args) {
        int[] arr = new int[ ]{-4,-3,-2,-1,0,2,3,5,7,8};
        System.out.println(binarySearch(arr,-3));
    }

    static int binarySearch(int[] array,int key){
        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = (high + low)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
