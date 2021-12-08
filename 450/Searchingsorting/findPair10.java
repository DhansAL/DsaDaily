package com.Searchingsorting;

import java.util.Arrays;



public class findPair10 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 80};
//        System.out.println(Arrays.toString(returnX(arr,78)));
        System.out.println(findPair(arr,78));
    }
    //O(N^2) BRUTE -  returned pair as array although question asked for boolean return
    static int[] returnX (int[] arr, int diff){
        int[] ans = new int[2];

        for (int i = 0; i < arr.length-1 ; i++) {
            int toFind = diff + arr[i];

            for (int j = 0; j <= arr.length-1; j++) {
                if(arr[j] == toFind){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }


    //Optimized answer expected time complexity O(NlogN)
    static boolean findPair(int[] arr, int diff){
        // 1. sort the array to apply binary search
        Arrays.sort(arr); //internal implementation - dual pivot quicksort TC - O(NlogN)
        boolean ans = false;
        //2. apply binary search from i+1
        for (int i = 0; i < arr.length-1 ; i++) {
            int toFind = diff + arr[i];
             ans = binarySearch(arr,toFind,i+1);
           if(ans){
               break;
           }
        }
        return ans;

    }
    static boolean binarySearch(int[] arr, int toFind , int start){
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (toFind < arr[mid]) {
                end = mid - 1;
            } else if (toFind > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;

    }

}
