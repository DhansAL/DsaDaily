package OOPS1;

class rbs {
    public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static  int search(int[] nums, int target){
        int pivot = findPivot(nums);
//      if !pivot i.e. arr is not rotated and simple bs will suffice
        if(pivot ==-1){
//                do normal bs
            return binarySearch(nums,target,0,nums.length-1);
        }
//         case 1 = target = pivot
        if(nums[pivot] == target){
            return pivot;
        }
//         case 2 target > s
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

            return binarySearch(nums,target,pivot+1,nums.length-1);

    }




      static  int binarySearch(int[] arr, int target,int start,int end){
            while(start<=end){
                int mid = start+ (end -start)/2;
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
            return -1;
        }

      static  int findPivot(int[] arr){
            int start = 0;
            int end = arr.length -1;
            while(start<=end){
                int mid = start+ (end -start)/2;
//             4 cases
                if(mid<end && arr[mid] > arr[mid+1]){
//                 found pivot
                    return mid;
                }
                if(start<mid && arr[mid] < arr[mid-1]){
                    return mid-1;
                }
//             3rd case
                if(arr[mid] <= arr[start]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }

            }
            return -1;
        }

}
