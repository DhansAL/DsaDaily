import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
int[] arr = {55,4,3,2,1};
cysort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cysort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int corIdx = arr[i] - 1;
            if(arr[i]!= arr[corIdx]){
                swap(arr,i,corIdx);
            }else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {
    int temp  = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
    }


}

