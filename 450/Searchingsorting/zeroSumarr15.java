package com.Searchingsorting;

public class zeroSumarr15 {
    public static void main(String[] args) {
  int[] arr = {0,0,5,5,0,0};
        System.out.println(zeroSumBrute(arr));
    }

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

}
