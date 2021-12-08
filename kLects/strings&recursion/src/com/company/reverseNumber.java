package com.company;

public class reverseNumber {
    static int sum = 0;
    static void reverseMeth1(int n){
        if(n == 0)return;
        int rem = n%10;
        sum = sum*10+rem;
        reverseMeth1(n/10);
    }

    static int revno2(int n){
    //first find no of digits in that no
        int digits  = (int)(Math.log10(n)) +1; //intuition in mathematics video
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem* (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }


    public static void main(String[] args) {
//       reverseMeth1(1234);
        System.out.println(revno2(1233));
//        System.out.println(sum);
    }



}
