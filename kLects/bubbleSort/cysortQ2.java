import java.util.ArrayList;
import java.util.List;

public class cysortQ2 {


     List<Integer> cysort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int corIdx = arr[i] - 1;
            if(arr[i]!= arr[corIdx]){
                swap(arr,i,corIdx);
            }else{
                i++;
            }
        }
//        just find missing nos now
         List<Integer> ans =    new ArrayList<>();
         for (int index = 0; index < arr.length; index++) {
             if(arr[index]  != index+1 ){
                 ans.add(index+1);
             }

         }
         return ans;
    }

     void swap(int[] arr, int first, int second) {
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
