package com.Searchingsorting;

import java.util.Arrays;

public class mergeSpace14 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 7, 8, 10 };
        int[]   arr2 =  { 2, 3, 9 };
//        System.out.println(Arrays.toString(mergeBrute(arr1,arr2)));
        mergeGap(arr1,arr2);
        System.out.println("1: " + Arrays.toString(arr1));
        System.out.println("2: " + Arrays.toString(arr2));
    }

    static int[] mergeBrute(int[] arr1, int[] arr2){
        /** brute approach 2 pointer O(N) space.
         * time complexity = sorting - NlogN + traversing O(N).
         * */
        int[] result =  new int[arr1.length+ arr2.length];
        int pointer = 0;
        for (int i = 0; i < arr1.length ; i++) {
            result[i] = arr1[i];
            pointer++;
        }
        for (int i = 0; i < arr2.length ; i++) {
            result[pointer] = arr2[i];
            pointer++;
        }
        Arrays.sort(result);
        return result;

    }

    /**
     * Better approach - INSERTION SORT (kinda)
     *               i++
     *      arr 1 = [1  4  7  8  10]
     *               j
     *      arr 2 = [2  3  9]
     *      if(arr[i]>arr[j]) swap both
     *      after swap, sort j's arr to maintain sort condition
     *      sort it by placing the 4(in this case) at an index where
     *      arr[j-1] < 4 by linear traversing.
     *      TIME COMPLEXITY - O(i traverse x sort traverse) - O(N^2). -- TLE
     *      SPACE COMPLEXITY - O(1) - no result array.
     *  * */
    static void mergeBetter(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        for (int i = 0; i <n1 ; i++) {
           if(arr1[i]>arr2[0]){
               //swap
               int temp = arr1[i];
               arr1[i] = arr2[0];
               arr2[0] = temp;

               int reorder = arr2[0];
               // move arr2[0] to tits correct order
               int j;
               for ( j = 1; j < n2 && arr2[j] < reorder ; j++) {
                   arr2[j-1] = arr2[j];
               }
               arr2[j-1] = reorder;
           }
        }
    }

    /**
     * USING THE MOST OPTIMIZED METHOD - O(NlogN) with no extra space
     *   1. find gap - ceil(n1+n2/2)
     */

    static int nextGap (int gap ){
        if(gap <=1){
            return 0;
        }
        return (int) Math.ceil(gap/2);
    }
    static void mergeGap(int[] arr1, int[] arr2){
            int i,j,gap = arr1.length+arr2.length;
            int n = arr1.length,m= arr2.length;
        for (gap = nextGap(gap); gap > 0;
             gap = nextGap(gap)) // run loop for each gap **logN-- 8-4-2-1
        {
            // comparing elements in the first
            // array.
            for (i = 0; i + gap < n; i++)
                if (arr1[i] > arr1[i + gap])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }

            // comparing elements in both arrays.
            for (j = gap > n ? gap - n : 0;
                 i < n && j < m;
                 i++, j++)
                if (arr1[i] > arr2[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }

            if (j < m)
            {
                // comparing elements in the
                // second array.
                for (j = 0; j + gap < m; j++)
                    if (arr2[j] > arr2[j + gap])
                    {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
            }
    }}


}
