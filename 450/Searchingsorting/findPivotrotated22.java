package com.Searchingsorting;

public class findPivotrotated22 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int ans = (RBS(arr));
        System.out.println(ans);
        System.out.println(ans+1 +"pivot");
    }

    static int RBS(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start <= end){
            //4 cases over here
            int mid = start + (end -start )/2;

            if(mid<end &&arr[mid] > arr[mid+1] ) return mid;
            if(mid>start && arr[mid-1]>arr[mid]) return mid-1;

             if(arr[mid] <= arr[start]){
                 end = mid -1;
             }else{
                 start = mid +1;
             }
        }
        return -1;
    }

}
