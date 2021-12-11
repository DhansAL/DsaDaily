package com.Searchingsorting;

import java.util.HashMap;

public class zeroSumarr15 {
    public static void main(String[] args) {
  long[] arr = {0,0,5,5,0,0};
        System.out.println(zeroSumOptimal(arr));
    }
/***
 * brute force - traversing in 2 nested loops to get
 * each sub array with sum == 0
 */

    static int zeroSumBrute(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j <arr.length; j++) {
                sum = sum +arr[j];
                if(sum == 0){
                    count++;
                }
            }
        }
        return count;
    }
    /***
     * better optimal approach - PREFIX SUM
     * use hashing to store the sum while looping
     * If prefix sum is 0 we increment the counter by 1.
     *  If it is present it means it is repeated, so we add the number of times
     *  prefix sum is present in map to the counter.
     */

//    logic - https://www.youtube.com/watch?v=QtbFXZrEZYc
    static long zeroSumOptimal(long[] arr){
        long sum =0, counter = 0;

        //hashmap to store the prefix sum while traversing
        HashMap<Long,Long> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            /**
             * NOT sum =+ arr[i]
             * reason :
             * a += b is short-hand for a = a + b (though note that the expression a will only be evaluated once.)
             *
             * a =+ b is a = (+b), i.e. assigning the unary + of b to a.
             *
             * Examples:
             *
             * int a = 15;
             * int b = -5;
             *
             * a += b; // a is now 10
             * a =+ b; // a is now -5
             */

            //if sum is 0|| elm is 0 i.e. found a sub array with 0 sum
            if(sum == 0 ) counter ++;

            //if sum is present in the hashmap for eg.
            //hashmap has 2 entries of this sum, increment counter by 2
            if(map.containsKey(sum)){
                counter += map.get(sum);
            }
            //incrementing the count of prefix sum obtained in Hashmap.
            if(map.containsKey(sum)){
                long k=map.get(sum);
                k++;
                map.put(sum,k);

            }
            else{
                map.put(sum, 1L);
        }
        }
        return counter;
    }
}
