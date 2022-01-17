package Recursion;

/**
 * gfg - https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
 *
 * Given a string find its first uppercase letter
 * Examples :
 *
 * Input : geeksforgeeKs
 * Output : K
 *
 * Input  : geekS
 * Output : S
 */

//iterative
public class Uppercase {
    public static void main(String[] args) {
        String str = "helloworld";
//        System.out.println(uppercase(str));
        recursive(str);
    }

    static char uppercase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return str.charAt(i); //either print or return
            }
        }
        return '0';
    }
    //recursive
    static void recursive(String str){
        int n = str.length();
        if(n==0){
            System.out.println("no uppercase char found");
            return;
        }
        if(Character.isUpperCase((str.charAt(n-1)))){
            System.out.println(str.charAt(n-1));
            return;
        }
        //remove the last element
        str =  str.substring(0, str.length() - 1);
        recursive(str);
    }
}
