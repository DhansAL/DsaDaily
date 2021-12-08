package OOPS1.inheritance;

public class Box {
double l;
double h;
 double w;

//constructor for a Box
    Box(){
        this.h =  -1;
        this.l = -1;
        this.w = -1;
    }

//    constructor for a cube
    Box(double side){
        this.w = side;
        this.l = side;
         this.h = side;

    }
//    passing 3 args in constructor

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information(){
        System.out.println("running the Box");
    }
}
