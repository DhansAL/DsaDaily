package com.Searchingsorting;

import java.util.Arrays;

public class productArr16 {
    public static void main(String[] args) {
    int[] ques = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(prodArr2(ques)));
    }
    /**
     * Method 1. using '/' operator
     * 1. Calculate the product of all elements of the array
     * 2. productArr[i] = prod/nums[i]
     * return productArray
     */
    static long[] prodArr(int[]arr){
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
          prod  = arr[i]*prod;
        }
        long[] prodArr= new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prodArr[i] = (prod/arr[i]);
        }
        return prodArr;
    }

    /**
     * SOLUTION - without the '/' operator
     * 1. make 2 arrays l & r
     * int[] l
     * l[0] =1
     *                       ->
     * l = 1 x [10  3  5  6  2 ]
     * l[l.length-1] = 1  , l[1] = 1x10, l[2]= 1x10x3(pointer@5),
     * l[3]=1x10x3x5, l[5] = 1x10x3x5x6(pointer at 2)
     * similarly make arr r but iterate from behind
     * r[n-1]=1
     *
     * create a prodArr =[arr.length]
     * fori{ prodArr[i] = l[i]*r[i]}
     * return prodarr
     */

    static int[] prodArr2(int[]arr){

        int[] l = new int[arr.length];
        l[0] = 1;
        int[] r = new int[arr.length];
        r[r.length-1]=1;

        //make l arr
        for (int i = 1; i < l.length; i++) {
            l[i] = l[i-1]*arr[i-1];
        }
        for (int i = r.length-2; i >=0 ; i--) {
            r[i] = r[i+1]*arr[i+1];
        }
        int[]nums = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            nums[i] = l[i]*r[i];
        }
        return nums;
    }

}
