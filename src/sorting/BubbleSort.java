package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        //implementation of BUBBLE SORT
        int[] arr = {7,8,3,1,2};
        //time complexity = O(n^2)
        for(int i = 0 ; i < arr.length -1; i++){
            for(int j = 0 ; j< arr.length - 1- i; j++){//the last element need not be compared again as it is the heaviest. therefore n-1-i
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }printArray(arr);


    }
    public static void printArray(int[] arr){
       for(int i = 0 ;i < arr.length ; i++){
           System.out.print(arr[i] + "");
       }
    }
}
