public class ceilingandfloor {
//    q1. ceiling of a number
//    ceiling = find the smallest no that is >= to target elm
//    floor is opp of ceiling

    public static void main(String[] args) {
        int[] arr  = {2,3,4,6,8,17,18,49};
        int ans = ceilorfloor(arr,19);
        System.out.println(ans);
    }
    static  int ceilorfloor(int[] arr,int target){
//        OUT OF ARRAY CASES;
        //ceil
//        if(target > arr[arr.length-1]){
//            return -1;
//        }
//        //floor
//        if(target < arr[arr.length-1]){
//            return -1;
//        }
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
        //if ceil return start if floor return end
        return end;
//        return start;



    }
}
