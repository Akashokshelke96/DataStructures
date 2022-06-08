package sorting.mergeSortImpl;

public class MergeSort2 {

    public static  void mergeSort(int[] arr , int start , int end){
        if(start<end) {
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            combine(arr, start, mid, end);
        }
    }

    public static void combine(int[] arr , int start , int mid , int end){
        int totalLength = end- start + 1;
        int[] c = new int[totalLength];

        int i = start , j = mid+1 , k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                c[k] = arr[i];
                k++;
                i++;
            }
            else {
                c[k] = arr[j];
                j++;
                k++;
            }

        }
        while(i<=mid){ //if elements in first half are remaining add them all
            c[k] = arr[i];
            i++;
            k++;
        }
        while(j<= end){//if elements in second half are remaining add them all
            c[k] = arr[j];
            j++;
            k++;
        }
        //copying elements from C back to arr;
        for( i = 0 ;i < totalLength ; i++){
            arr[start + i] = c[i];
        }

    }
}
