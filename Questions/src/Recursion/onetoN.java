package Recursion;

public class onetoN {
    public static void main(String[] args) {
        fn(5);
    }
    static void fn (int n){
        if(n==0) return;
        System.out.println(n);
        fn(n-1);
    }

}
