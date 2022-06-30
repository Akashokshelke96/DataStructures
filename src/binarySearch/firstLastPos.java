package binarySearch;

import java.util.Arrays;

public class firstLastPos {
    public static void main(String[] args) {
        //find tha first and last range of target
        int arr[] = {2, 3, 7,7,7,7, 13, 14, 16, 18, 20};

        System.out.println(Arrays.toString(searchRange(arr,7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    //this function just returns index values of target;
    static int search(int[] nums , int target, boolean findStartIndex){
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findStartIndex == true){
                    end = mid-1;
                }else{
                    start =mid+1;
                }
            }
        }
        return ans;
    }
}

