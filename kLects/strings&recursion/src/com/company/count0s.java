package com.company;

public class count0s {
    public static void main(String[] args) {

        System.out.println(count(1020203));
    }
    static int count(int n ){
        return helper(n,0);
    }
    private static int helper(int n , int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }


}
