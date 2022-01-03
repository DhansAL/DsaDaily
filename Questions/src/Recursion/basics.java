package Recursion;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
//        nto1func(4);
//        System.out.println(digitSum(1342));
        ArrayList<Integer> fd = new ArrayList<>();
        reverseNoArray(4321,fd);
//        System.out.println(fd);
        reverseNo(4321);
    }
    static void nto1func(int n){
        if(n == 0){
            System.out.println("");
            return;
        }
        System.out.print(n); // 4321
        nto1func(n-1);
        System.out.print(n); //1234 - print after stack is empty

    }
    static int digitSum (int n){
        if(n == 0) return 0;
        return (n%10) + digitSum(n/10);
    }

    /**
     * n--  vs --n
     */

    static void reverseNoArray(int n, ArrayList<Integer> arr){
        if(n == 0) return;
        arr.add(n%10);
        reverseNoArray(n/10,arr);

    }
    static void reverseNo(int n){
        if(n == 0) return ;
        System.out.println(  n%10);
         reverseNo(n/10);
    }
}
