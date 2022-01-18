package Recursion;

public class lengthstring {
    public static void main(String[] args) {
        System.out.println(fn("hello",0));
        System.out.println(fn2("hello"));
    }
    //lol approach
    static int fn(String str,int n){
    if(str == "")return n;
    str =  str.substring(0, str.length() - 1);
    return fn(str, n+1);
    }
    // better approach
    static int fn2(String str){
        if(str == "")return 0;
       return fn2(str.substring(1))+1;
    }

}
