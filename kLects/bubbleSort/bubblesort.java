import java.util.Arrays;

public class bubblesort {
    public static void main (String[] args) {
        int[] arr  = {5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step max elm will shift to last relative idx
            for (int j = 1; j < arr.length-i; j++) {
                //swap the item if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] =  arr[j-1];
                    arr[j-1]=  temp;
                }
            }
        }
    }
}
