package OOPS1.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"dokakuri");
        int n = obj.num; //can access protected in same package different class
    }
}
