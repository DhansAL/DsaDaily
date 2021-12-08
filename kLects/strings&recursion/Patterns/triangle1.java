package com.company.Patterns;

public class triangle1 {
    public static void main(String[] args) {
        triangle(4,0);
    }

    static void triangle(int r,int c){
        /*
        pattern
        ****
        ***
        **
        *
       */
        if (r ==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }else{
            System.out.println();
            triangle(r-1,c=0);
        }
    }

}
