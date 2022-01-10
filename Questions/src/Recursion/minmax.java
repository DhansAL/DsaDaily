package Recursion;
/**
 * GFG - https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
 * Recursive Programs to find Minimum and Maximum elements of array
 * Given an array of integers arr, the task is
 * to find the minimum and maximum element of that array using recursion.
 *
 * Input: arr = {1, 4, 3, -5, -4, 8, 6};
 * Output: min = -5, max = 8
 */
public class minmax {
    public static void main(String[] args) {
       int[] arr = {5,8,3,2};
        System.out.println(iterativeMax(arr));

    }
    static int getMin(int[] arr, int n){
        if(n == 1){
            return arr[n];
        }
        return Math.min (arr[n-1] , getMin(arr,n-1));
    }
    static int getMax(int[] arr, int n){
        if(n == 1){
            return arr[n];
        }
        return Math.max (arr[n-1] , getMax(arr,n-1));
    }


    //iterative
    static int iterativeMax(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]<arr[i+1]){
               ans=arr[i+1];
           }
        }
        return ans;
    }

}
