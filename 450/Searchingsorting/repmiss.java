package answers;

import java.util.ArrayList;
import java.util.Arrays;

public class repmiss {
    public static void main(String[] args) {
        int[] arr = {2,4,1,2,5};
        System.out.println(Arrays.toString(findRepMiss(arr,5)));
    }
    static int[] findRepMiss(int[] arr, int n){

        int ans[] = new int[2];

//        this will handle rep case
        for (int i = 0; i < n; i++) {
            if(arr[Math.abs(arr[i]) -1] <0){
                ans[0] = Math.abs(arr[i]);

            }else{
                arr[Math.abs(arr[i]) -1] = -arr[Math.abs(arr[i]) -1];
            }
        }
//        now handle miss case
        for (int i = 0; i <n ; i++) {
            if(arr[i]>0){
                ans[1] = i+1; //+1 for the indexing (starts from 0)
            }

        }

        return ans;
    }
}
