package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        //implementation of BUBBLE SORT
        int[] arr = {7,8,3,1,2};
        //time complexity = O(n^2)
        for(int i = 0 ; i < arr.length; i++){
            int current = arr[i];//taking every element once as current
          int j = i-1; //to make the sorted array section in the array

            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j] ; //putting the smaller element before the bigger one in the array
                j--;
            }
            arr[j+1] = current ; //if the while cond. fails,either all elements are sorted or current is bigger than j element
        }printArray(arr);


    }
    public static void printArray(int[] arr){
        for(int i = 0 ;i < arr.length ; i++){
            System.out.print(arr[i] + "");
        }
    }
}