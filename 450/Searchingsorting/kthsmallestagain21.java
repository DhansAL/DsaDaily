package com.Searchingsorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * link - https://www.hackerearth.com/practice/algorithms/
 * searching/binary-search/practice-problems/algorithm/kth-smallest-number-again-2/
 * hackerearth is shit
 * try
 * https://www.geeksforgeeks.org/find-k-th-smallest-element-in-given-n-ranges/
 *
 *  STATEMENT -
 *  Given n and q, i.e, the number of ranges and number of queries, find the kth
 *  smallest element for each query (assume k>1).Print the value of kth smallest
 *  element if it exists, else print -1.
 *
 * EXAMPLE-
 * Input : arr[] = {{1, 4}, {6, 8}}
 *         queries[] = {2, 6, 10};
 * Output : 2
 *          7
 *         -1
 * After combining the given ranges, the numbers
 * become 1 2 3 4 6 7 8. As here 2nd element is 2,
 * so we print 2. As 6th element is 7, so we print
 * 7 and as 10th element doesn't exist, so we
 * print -1.
 */

public class kthsmallestagain21 {
    public static void main(String[] args) {

    }
    class Interval {
        int start , end;

        //constructor
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    // Function that takes a set of intervals, merges
    // overlapping intervals and prints the result
    static void mergeIntervals(Interval[] arr){
        // Sort Intervals in increasing order of
        // start time
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });


    }



}
