package binarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        //find the smallest element in array which is greater or equal to target element;
        //leetcode solution
        int arr[]  = {2,3,4,5,6,12,13,14,16,18,20};
        System.out.println(findCeil(arr,17));
    }

    static int findCeil(int[]arr , int target) {
        if(target > arr[arr.length-1]){
            return -1;
        }


        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<= end){
            mid = start + ((end-start) / 2);
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start]; //when while loop breaks start will be equal to end+1;
        //therefore next big element required will be at START index;
    }
}



