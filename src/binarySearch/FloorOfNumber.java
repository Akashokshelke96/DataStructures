package binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        //find the GREATEST element in array which is SMALLER or equal to target element;
        //TIME COMPLEXITY = 0(logN)
        int arr[]  = {2,3,4,5,6,12,13,14,16,18,20};
        System.out.println(findFloor(arr,1));
    }
     // find greatest number <= target
    static int findFloor(int[]arr , int target) {
        if(target < arr[0]){
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
        return arr[end];
    }
}

