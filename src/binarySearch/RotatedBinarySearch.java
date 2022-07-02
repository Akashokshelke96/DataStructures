package binarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,0,1,2};
        System.out.println(search(arr,3));
    }
    static int search(int[] nums,int target){
        int pivot = findPivot(nums);
        //if not found..
        if(pivot == -1){
            //just od binary search
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot found..we got two ascending sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0 , pivot -1);

        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    //for arrays with no duplicates
    static int findPivot(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            //4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                //search after the mid
                start = mid + 1;
            }

        }
        return -1;
    }
 //for arrays with duplicates
    static int findPivotWithDuplicates(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            //4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates of start and end;

                //NOTE: what if elements at start or end is pivot??
                if(arr[start] > arr[start + 1]){
                    return start; //as pivot
                }
                start = start  + 1;

                if(arr[end] > arr[end-1]){
                    return end -1;
                }
                end = end - 1;

            }
            //left is sorted..so check right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }


    static int binarySearch(int[] arr , int target, int start , int end) {

        while(start<= end){
            int mid = start + ((end-start) / 2);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
