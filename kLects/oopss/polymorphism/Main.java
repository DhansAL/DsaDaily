package OOPS1.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
//        Square square = new Square();
//        Shapes square = new Square();
        Shapes square  = new Square();
        square.area();//this call should print the area method of shapes class because as
        //discussed earlier, we have access to the parameters of ref class / var/obj/type only
//        so why does it call the method of square class

    }
}
