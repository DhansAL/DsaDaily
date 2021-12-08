package com.company;

public class digitSum {
    public static void main(String[] args) {
        int ans  = sum(1342);
        System.out.println(ans);

    }
    static int sum(int n ){
        //base case -recursion stops
        if(n==0){
            return 0;
        }
        return (n%10)+ sum(n/10);

    }
}
