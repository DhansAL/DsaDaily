package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_M1 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println((combinationSum(candidates, target)));
    }

    static void rec(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> tempDs) {
        if (idx >= arr.length) {
            //recursion is terminating
            if (target == 0) {
                // the desired combination
                ans.add(new ArrayList<>(tempDs));
            }
            return;
        }

        if (arr[idx] <= target) {
            tempDs.add(arr[idx]);
            rec(idx, arr, target - arr[idx], ans, tempDs); // the picking path
            tempDs.remove(tempDs.size() - 1); //remove the extra while backtracking

        }
        rec(idx + 1, arr, target, ans, tempDs); //the not picking path
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}
