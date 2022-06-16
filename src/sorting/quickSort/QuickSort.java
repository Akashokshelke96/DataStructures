package sorting.quickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);

            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = -1;

        for(int j=0;j<high;j++){
            if(arr[j]<pivot){
                //swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,7,4,9,8};
        quickSort(arr,0,arr.length-1);

        for (int num:arr){
            System.out.print(num);
            System.out.println();
        }
    }
}
