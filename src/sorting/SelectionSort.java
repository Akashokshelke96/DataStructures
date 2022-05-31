package sorting;

public class SelectionSort {

        public static void main(String[] args) {
            //implementation of SELECTION SORT
            int[] arr = {7,8,3,1,2};
            //time complexity = O(n^2)
            for(int i = 0 ; i < arr.length -1; i++){
                int smallest = i;
                for(int j = i+1 ; j< arr.length; j++) {//first element need not be checked once it is already the smallest in array therefore i=i+1
                    if (arr[smallest] > arr[j]) {
                        smallest = j;

                    }
                }//swapping and putting 1st element as the smallest one
                        int temp = arr[smallest];
                        arr[smallest] = arr[i];
                        arr[i] = temp;
                    }
                printArray(arr);
                }
        public static void printArray(int[] arr){
            for(int i = 0 ;i < arr.length ; i++){
                System.out.print(arr[i] + "");
            }
        }

    }
