/***
 * for fixed length of stack we can use basicStack class.
 * but if the initial size of the stack is unknown we need to
 * increase the size of the array.
 *
 */
public class DynamicStack extends basicStack{
    public DynamicStack(){
        super(); //it will call basicStack(); i.e. the size will be DEFAULT_SIZE.
    }
    public DynamicStack(int size){
        super(size); // calls basicStack(int size) constructor.
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the array size
            int[] temp = new int [data.length*2];
            //copy the previous array into the doubled blank array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data= temp;
        }
        return super.push(item);
    }
}
