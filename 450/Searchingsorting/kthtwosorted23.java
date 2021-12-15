package com.Searchingsorting;

import java.util.ArrayList;

/**
 * gfg - https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
 *
 * K-th element of two sorted Arrays
 * Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K.
 * The task is to find the element that would be at the k’th position of the final sorted array.
 *
 * Input:
 * arr1[] = {2, 3, 6, 7, 9}
 * arr2[] = {1, 4, 8, 10}
 * k = 5
 * Output:
 * 6
 * Explanation:
 * The final sorted array would be -
 * 1, 2, 3, 4, 6, 7, 8, 9, 10
 * The 5th element of this array is 6.
 */
public class kthtwosorted23 {
    public static void main(String[] args) {
    //approach 1
        int[] arr1 =  {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        System.out.println(kthemOptimal(arr1, arr2, 5));
    }
    /**
     * Approach 1 :- 2 pointer push method
     * arr1[0] = i;i++
     * arr2[0]= j;j++
     * if arr[i]>arr[j]=> push(result[]) else visa versa
     *
     * TC - O(N)+O(N) ; SC-o(n)
     * */
    static int kthem(int arr1[], int arr2[], int k){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0,j= 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                result.add(arr2[j]); //****think here
                j++;
            }else{
                result.add(arr1[i]);
                i++;
            }

        }
        while(i<arr1.length){
            result.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            result.add(arr2[j]);
            j++;
        }
        System.out.println((result));
        return result.get(k-1);
    }

    /**
     * Approach2 - dont use that result array rather
     * pass variable idx at each check case
     */
    static int kthemOptimal(int arr1[], int arr2[], int k){
        int i = 0,j= 0,idx = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                idx++; //we inc idx first cuz k!<=0 <constraint>, there can't be 0th elm
                if(idx == k)  return arr2[j];
                j++;
            }else{
                idx++;
                if(idx == k) return arr1[i];
                i++;
            }

        }
        while(i<arr1.length){
            idx++;
            if(idx == k ) return arr1[i];
            i++;
        }
        while(j<arr2.length){
            idx++;
            if(idx == k)  return arr2[j];
            j++;
        }
        return -1 ;
    }

}
