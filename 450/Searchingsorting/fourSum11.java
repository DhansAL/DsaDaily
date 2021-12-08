package com.Searchingsorting;

import java.util.ArrayList;
import java.util.Arrays;

public class fourSum11 {
    public static void main(String[] args) {
        int[] arr = {0,0,2,1,1};
        System.out.println(fourSum(arr,3));

    }
    static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        //base cases:  n<4 cant get a quadruple , return blank ArrayList
        if (n < 4) return ans;
        if(arr == null || arr.length == 0) return ans;

        //1. SORT the array  - O(NlogN)
        Arrays.sort(arr);

        //2. 2 loops for pointers i & j
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
//                  i  j  f<-       ->b
//                [ 1, 1, 2,   3,  4, 4]
                int sumIJ = k - arr[j] - arr[i];
                // target total (k) - j - i (arr[j]>arr[i] cuz sorted)
                int front = j+1;
                int back = n -1;

                while(front < back) {
                    int sumFB = arr[front] + arr[back];
                    //move the front pointer if arr[f]is smaller than sumIJ
                    if(sumFB < sumIJ){
                        front++;
                    }else if(sumFB>sumIJ){
                        back--;
                    }
                    else{
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[front]);
                        quad.add(arr[back]);
                        ans.add(quad);

                    // Duplicate removal for idx3 && idx4 numbers
                    // using prefix increment rather than postfix cuz
                    // we don't want to skip an element cuz of upper FOR loop
                    while(front < back && arr[front] == quad.get(2)){
                        --front;
                    }
                    while(front < back && arr[back] == quad.get(3)){
                        --back;
                    }
                      }
                }
                // duplicate case for i and j loops
                while(j+1 < n && arr[j+1] == arr[j]){
                    ++j;
                }
            }
            while(i+1 < n && arr[i+1] == arr[i]){
                ++i;
            }
        }
        return ans;
    }

}
