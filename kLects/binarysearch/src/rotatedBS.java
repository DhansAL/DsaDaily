public class rotatedBS {
    public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2,};
        System.out.println(findPivot(arr));

    }

    static int  findPivot(int[] arr){
    int start = 0;
    int end =  arr.length -1;
    while(start<end){
        int mid = start +(end-start)/2;
    //4 cases over here
        //1.
         if(mid<end //this is done to prevent indexoutofbound error cuz mid can be == end here
                 && arr[mid]>arr[mid+1]){
             return mid;
         }
        //2.
        if(mid>start && arr[mid]<arr[mid-11]){
            return mid-1 ;
        }
//        case3
        if(arr[mid]<= arr[start]){
            end= mid-1;
        }else{
            start = mid+1;
        }
    }
    return -1;
    }
}
