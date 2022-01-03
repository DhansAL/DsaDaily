package Recursion;

public class factorialOfNum {
    public static void main(String[] args) {
        System.out.println( factNum(6));
    }
    static int factNum(int n){
        if(n <= 1) return 1; // if passed 0||-ve int recursion will stop.
        return n*factNum(n-1);
    }
}
