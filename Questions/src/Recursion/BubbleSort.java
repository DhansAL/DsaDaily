package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1,3,44,2};
//        bubblesort(arr);
        recursive(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubblesort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static int[] recursive(int[] arr,int n){

        // Base case
        if (n == 1)
            return arr;

        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        // Largest element is fixed,
        // recur for remaining array
        return recursive(arr, n-1);
    }



}
