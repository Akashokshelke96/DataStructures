package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //binary search for both increasing and decreasing order
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,8));
    }
    static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        //find whether array is sorted ascending or descending
        boolean isAsc  = (arr[start] < arr[end]);

        while(start<= end){
            int mid = start + ((end-start) / 2);


            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if (arr[mid] < target) {
                    start = mid + 1;

                } else{
                    end = mid - 1;
                }
            }
            else{
                if (arr[mid] > target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
