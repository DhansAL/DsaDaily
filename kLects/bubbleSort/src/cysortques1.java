import java.util.Arrays;

public class cysortques1 {
    public static void main(String[] args) {
         int[] arr = {4,0,2,1};

        System.out.println(   missingNo(arr));

    }
    public  static  int missingNo(int[] arr){
        int i = 0;
        while(i<arr.length) {
            // only swap when arr[i] is less than size of arr
            int corIdx = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[corIdx]) {
                swap(arr, i, corIdx);
            } else {
                i++;
            }
        }
        //now search for first missing elm or no
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx) {
                return idx;
            }
        }
        //otherwise, case 2 when arr[i] > biggest i
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
