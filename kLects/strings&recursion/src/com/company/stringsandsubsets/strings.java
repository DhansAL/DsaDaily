package com.company.stringsandsubsets;

public class strings {
    public static void main(String[] args) {
        skip("","baccaadjd");
    }
    //processed=ans string, up = ques string
    //recursion meth 1 - changing the string in func body
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch  = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
            //substring 1 is bcz eg accad = curr up then if we have to ignore a then we have to make up remove
            //a so first char is a in a counter case so then we can remove it by using this method
        }else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skip2(String up){
        if(up.isEmpty()){
            return"";
        }
        char ch  = up.charAt(0);
        if(ch == 'a'){
           return skip2(up.substring(1));
            //substring 1 is bcz eg accad = curr up then if we have to ignore a then we have to make up remove
            //a so first char is a in a counter case so then we can remove it by using this method
        }else{
          return   skip2(ch+ up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return"";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
            //substring 1 is bcz eg accad = curr up then if we have to ignore a then we have to make up remove
            //a so first char is a in a counter case so then we can remove it by using this method
        }else{
            return up.charAt(0)+ skipApple( up.substring(1));
        }
    }

}
