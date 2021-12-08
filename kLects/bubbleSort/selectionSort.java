import java.util.Arrays;

public class selectionSort {
    // tc = ON^2 BEST AND WORST CASES IRRESPECTIVELY
    public static void main (String[] args) {
        int[] arr  = {5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            //find the elm with max value and swap it with correct or max index
            int last = arr.length -i-1;
            int maxIdx = getMaxIndex(arr,0,last);
            swap(arr,maxIdx,last);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private  static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }



}
