package com.Searchingsorting;

//https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
/*
* Given an array arr[] of distinct integers of size N
* and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k)
*  with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.
*
*
*
Input: N = 4, sum = 2
arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with
sum less than 2 (-2, 0, 1) and (-2, 0, 3).
*
* */


import java.util.Arrays;

public class countTriplets13 {

    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 3};
//        System.out.println(tripletsBrute(arr,2));
        System.out.println(optimizedTriplets(arr,2));

    }

    //Brute force approach expected TC - O(n^3)
    static int tripletsBrute(int[] arr, int sum) {
        int count = 0;  // stores the count of triplets
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if(arr[i]+arr[j]+arr[k] < sum ){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //O(N^2) optimized 2 pointer approach
    static int optimizedTriplets(int[] arr, int sum){
        Arrays.sort(arr);
        // Initialize result
        int ans = 0;
        /**
         * // 1. Sort the array
         *
         *  2. loop with 2 pointers
         *     i  f->  <-b
         *    -2  0  1  2
         *    if arr[idx's] > sum - b--
         *    if arr[idx's] < sum (we got the triplet) - count ++ for all elms
         *    from front to back (break loop here and move i++
         */
        Arrays.sort(arr);
         int n = arr.length;
         int count = 0;

        for (int i = 0; i < n-2; i++) {
            int f = i+1;
            int b = n-1;

            while(f<b){
                int idxSum = arr[i]+arr[f]+arr[b];
                if(idxSum < sum){
                    count += (b-f);
                    f++;
                }
                else b--;
            }
        }

        return count;
        }




}

