package Recursion;

import java.util.Arrays;

/**
 * GFG - https://www.geeksforgeeks.org/sum-triangle-from-array/
 *
 * Given an array of integers, print a sum triangle from it such that the first level has
 * all array elements. From then, at each level number of
 * elements is one less than the previous level and elements at the level is
 * been the Sum of consecutive two elements in the previous level
 *
 * EXAMPLE
 * Input : A = {1, 2, 3, 4, 5}
 * Output : [48]
 *          [20, 28]
 *          [8, 12, 16]
 *          [3, 5, 7, 9]
 *          [1, 2, 3, 4, 5]
 *
 * Explanation :
 * Here,   [48]
 *         [20, 28] -->(20 + 28 = 48)
 *         [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
 *         [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
 *         [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
 *
 */

public class sumArrTriangle {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        sumArrTriangle(A);
    }
    static void sumArrTriangle(int[] A){

            // Base case
            if (A.length < 1)
                return;

            // Creating new array which contains the
            // Sum of consecutive elements in
            // the array passes as parameter.
            int[] temp = new int[A.length - 1];
            for (int i = 0; i < A.length - 1; i++)
            {
                int x = A[i] + A[i + 1];
                temp[i] = x;
            }

            // Make a recursive call and pass
            // the newly created array
        sumArrTriangle(temp);

            // Print current array in the end so
            // that smaller arrays are printed first
            System.out.println(Arrays.toString(A));
    }
}
