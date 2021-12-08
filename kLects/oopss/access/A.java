package OOPS1.access;

public class A  {
  protected   int num ;
    String name;
    int[] arr;

    public int getNum(){
    return num; // can access on same class
    }
    public void setNum(){
        this.num = num;
    }
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
