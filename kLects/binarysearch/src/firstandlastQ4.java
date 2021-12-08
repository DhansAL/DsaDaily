public class firstandlastQ4 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        //check for FIRST OCCURENCE of target
        ans[0]= search(nums,target,true);
        ans[1] = search(nums,target,false);


        return ans;
    }
    //this func will return the idx of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start =  0;
        int end = nums.length -1;
        while(start<=end){
            //find the middle elm
            int mid = start+ (end-start)/2; //optimized way to handle very big values stored in int
            if(target < nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                //potential ans is formed
                ans= mid  ;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
