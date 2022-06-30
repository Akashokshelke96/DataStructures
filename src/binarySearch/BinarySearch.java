package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //Given an array of integers nums which is sorted in ascending order, and an integer target, write
        // a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,9));
    }
    static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

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
