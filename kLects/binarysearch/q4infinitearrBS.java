public class q4infinitearrBS {

    public static void main(String[] args) {
    //start with size 2 of (chunk)
    int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,777,888};
    int target = 55;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //first find the chunk to search or aka range
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        //these are the arr idx
        //condition for the target to lie in the chunk
        // target should be less than end otherwise theres no point in searching in that chunk
        //eg 2,32,4,5,6,6,7,87,8 and target be like 333
        while(target>arr[end]){
            int newStart = end+1;
            //now double the chunk's range
            end = end + /*size of the current chunk that'll be*/ (end - start +1)*2;
            //if youre not getting the formula check explanation
            start = newStart;
        }
    return binarySearch(arr,target,start,end);
    }
    static  int binarySearch(int[] arr,int target,int start,int end){
//         start =  0;
//         end = arr.length -1;
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
        return -1;

    }
}
