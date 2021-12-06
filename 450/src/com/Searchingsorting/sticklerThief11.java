/**
 * gfg link - https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1
 *
 * Example 1:
 *
 * Input:
 * n = 6
 * a[] = {5,5,10,100,10,5}
 * Output: 110
 * Explanation: 5+100+5=110
 */
package com.Searchingsorting;

public class sticklerThief11 {
    public static void main(String[] args) {
        int[] arr = {5,5,10,100,10,5};
        System.out.println(findMax(arr,6));

    }

    static int findMax(int arr[], int n){
        //Base cases
        if(n == 1) return arr[0];
        if(n == 2) return Math.max(arr[0],arr[1]);

        // including and excluding tree explanation -
        // https://www.youtube.com/watch?v=VT4bZV24QNo

        //initial includes and excludes
        int inc = arr[0];
        int exc = 0;

        for (int i = 1; i < n  ; i++) {
            int nInc = exc + arr[i];
            int nExc = Math.max(inc,exc);

            inc = nInc;
            exc = nExc;
        }

        // return the max of final inc and exc
        int ans = Math.max(inc,exc);
        return ans;
    }
}

/*
 result - passed

 */