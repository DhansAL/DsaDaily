package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(BSrecursion(arr,2,arr[0],arr[arr.length-1]));

    }
    static int BSrecursion(int[] arr, int target , int start,int end){
        int mid = start + (end-start)/2;
        if(start>end) return -1;
        if(arr[mid] == target) return mid; //return index not arr[mid]

        if(arr[mid]>target) return BSrecursion(arr,target,start,mid-1);
        return BSrecursion(arr,target,mid+1,end);
    }

}
