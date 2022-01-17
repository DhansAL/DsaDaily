package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] str1 = {"h","e","l","o"};
        String[] str = {"h","e","l","o"};
        System.out.println(Arrays.toString( reverseIterative(str)));;
        recursive(str1,0,str.length-1);
    }
    static String[] reverseIterative(String[] str){
        int s = 0;
        int e=str.length-1;
        while(s<=e){
            //interchange
            String temp = str[s];
            str[s] = str[e];
            str[e] = temp;
            s++;
            e--;
        }
        return str;
    }

    static void recursive (String[] str,int s, int e){
        if(s>=e){
            System.out.println(Arrays.toString(str));
            return;
        }
        //interchange
        String temp = str[s];
        str[s] = str[e];
        str[e] = temp;

        recursive(str,s+1,e-1);
    }
}
