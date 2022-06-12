package com.sourceCode.recursion;

public class findIfSorted {
//TIME COMPLEXITY = O(N);
    public static boolean isSorted(int[] arr, int idx) {
//Finding if an array is strictly sorted or not.

        if (idx == arr.length - 1) {
            //base case , recursion has to end if index reaches end point in array
            return true;
        }
            if ((arr[idx] < arr[idx + 1]) && (arr[idx] + 1 == arr[idx + 1])) {
                //array is sorted till now
              return isSorted(arr,idx+1);
            } else {
                return false;
            }

        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(isSorted(arr,0));
    }
}
