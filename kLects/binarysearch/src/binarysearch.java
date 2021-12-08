public class binarysearch {
      /*
      steps to do binary search
      1. find a middle element round(total elm/2)
      2. target > mid then search at right else left side
      3. if mid == target elm , ans == mid
       */
      public static void main(String[] args) {
    int[] arr  = {2,3,4,5,6,7,8,9};
    int ans = binarySearch(arr,9);
          System.out.println(ans);
      }
      //return the index
    //return -1 if it does not exists
    static  int binarySearch(int[] arr,int target){
          int start =  0;
          int end = arr.length -1;
          while(start<=end){
              //find the middle elm
              int mid = start+ (end-start)/2; //optimized way to handle very big values stored in int
              if(target < arr[mid]){
                  end = mid-1;
              }else if(target>arr[mid]){
                  start = mid+1;
              }else{
                  return  mid;
              }
          }
              return 007;

    }
}
