package sorting.mergeSortImpl;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,7,20,18,34};

        int n = arr.length;

        MergeSort2.mergeSort(arr,0,n-1);

        for(int num : arr){
            System.out.print(num + " ");
            System.out.println();
        }
    }
}
