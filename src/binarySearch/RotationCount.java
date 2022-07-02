package binarySearch;

public class RotationCount {


    public static void main(String[] args) {
        int[] arr = {4, 5 , 6 ,7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }
    public static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot +1 ;
    }


    static int findPivot(int [] arr) { //the greatest number
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
