package linkedLists;

public class Main {
    public static void main(String[] args) {
LL list  = new LL();
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(5);
//        list.insertFirst(11);
//        list.insertLast(99 );
//        list.insert(100,4);
        list.display();
        System.out.println("");
        list.insertRec(88,2);
        list.display();

    }
}
