public class mountainArQ6 {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in the decreasing part of the binary search chunk 1 2 3 4 arr[mid]->3   arr[mid+1]->2 1
                //mid may be the ans but peak may be at left as here (4 is the peak )
                //this is why end  != mid-1
                end  = mid;
            }else{
                //you are in ascending part of the arr
                start = mid+1;
                //because mid+1 >mid so we ignore mid elm
            }
        }
        //in the end start == end and pointing the ans
        return start;//or return end doesnt matter cuz both equal
    }
}
