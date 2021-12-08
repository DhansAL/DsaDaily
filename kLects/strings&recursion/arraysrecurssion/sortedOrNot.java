package com.company.arraysrecurssion;

import java.util.ArrayList;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,55,55,66,77,88,55,66};
        ArrayList<Integer> ans = findAllIndex(array,55,0,new ArrayList<>());
        System.out.println(ans);
    }

    static  boolean sorted(int[] arr,int index){
        // base condition
        if(index == arr.length -1){
            return true;
        }
        return arr[index]< arr[index+1] && sorted(arr,index +   1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);

        }
        return findAllIndex(arr,target,index+1,list);
    }

}
