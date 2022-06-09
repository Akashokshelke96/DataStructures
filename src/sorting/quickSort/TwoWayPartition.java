package sorting.quickSort;

import java.util.Arrays;

public class TwoWayPartition {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,7,8,4};

        int f = 0;
        int pivot  = arr[arr.length - 1];

        for(int curr = 0; curr< arr.length ; curr++ ){
            if(arr[curr]<= pivot){
                //swapping the current element with element at F,
                int temp = arr[curr];
                arr[curr] = arr[f];
                arr[f] = temp;
                f++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
