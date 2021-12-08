package com.company.sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
    int[] arr= {5,4,3,2,1};
    int[] ans  = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergesort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        //pointers
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length ){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++; // you have to change position in result array too, or it will keep changing values for one index only
        }
        //if one array is not completely pushed in result array just push the rest of the elems in result array
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
