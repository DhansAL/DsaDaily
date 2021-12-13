//package com.Searchingsorting;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//
//public class minSwaps18 {
//    public static void main(String[] args) {
//
//    }
//
//    static int minSwaps(int arr[]) {
//        ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
//        int N  = arr.length;
//        for (int i = 0; i <N ; i++) {
//            ArrayList<Integer> temp = new ArrayList<>();
//            temp.add(arr[i]);
//            temp.add(i);
//            pair.add(temp);
//        }
//        // sort the array according to index
//        pair.sort(new Comparator<ArrayList<Integer>>() {
//            @Override
//            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
//                return o1.get(0).compareTo(o2.get(0));
//            }
//        });
//        int counter = 0;
//        for (int i = 0; i < N ; i++) {
//            if (pair.get(i).get(1) == i) continue;
//
//            else{
//                counter++;
//                swap(pair.get(i),)
//            }
//        }
//    }
//
//    static ArrayList<Integer> swap(ArrayList<Integer> swaparr){
//        int temp  = swaparr.get(0);
//        swaparr.get(0) = swaparr.get(1);
//        swaparr.get(1) = temp;
//    }
//    // implementation err
//    // try this at 14-12-21
//}
