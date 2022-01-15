/**
 * Implementation of custom stack.
 * objective - to know internal working of a stack
 */


public class basicStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int idx = -1;

    public basicStack() {
        this(DEFAULT_SIZE);
    }

    public basicStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full!");
            return false;
        }
        idx++;
        data[idx]=item;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop from an empty stack!");
        }
        return data[idx--];
    }

    public int peek () throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot peek from an empty stack!");
        }
        return data[idx];
    }


    public boolean isFull() {
        //checks if the current idx of inserted elm is at arr.length or not.
        return idx == data.length -1;
    }
    public boolean isEmpty() {
        //checks if the stack is empty or not.
        return idx == -1;
    }


}
