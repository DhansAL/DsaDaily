package Recursion;

public class fibbonaci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n) {
        if(n<2)return n; //for f0 and f1;
        return fibo(n-1)+fibo(n-2);

    }
    }

