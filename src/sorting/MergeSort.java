package sorting;

import resizableArray.ResizableArray;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{2,5,8,9,10};
        Integer[] b = new Integer[]{2,4,7,8,18};

        ArrayList arr = new ArrayList();

        int n = a.length, m = b.length , i = 0 , j = 0;

        while(i<n || j<m){
            if( i<n && j< m){
                if(a[i] <= b[j]){
                    arr.add(a[i]);
                    i++;
                }
                else{
                    arr.add(b[j]);
                    j++;
                }
            }
            else if(i<n) { // there are no remaining elements in array B.
                arr.add(a[i]);
                i++;
            }
            else{
                arr.add(b[j]);
                j++;
            }
        }

        System.out.println(arr);
    }

}
