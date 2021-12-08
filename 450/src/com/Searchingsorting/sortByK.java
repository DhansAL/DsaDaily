package answers;

public class sortByK {
    public static void main(String[] args) {
        int[] arr = {5,6,7,9,11,10};
//        System.out.println(searchKey(arr,4));
        System.out.println(searchOptimized(arr,11,arr.length,2));
    }
    static int searchKey(int[] givenArr,int key){
        int ans = -1;
        for (int i = 0; i < givenArr.length ; i++) {
            if(givenArr[i] == key){
            ans = i;
            break;
            }
        }
        return ans;
    }
    static int searchOptimized(int[] arr,int key,int n,int diff){
        int i = 0;
        while(i<n){
            if(arr[i] == key){
                return i;
            }
            // if ! arr[i]== key, jump the diff bw arr[i]&key/k
            i = i + Math.max(1, Math.abs(arr[i]
                    - key) / diff);
             }
        System.out.println("NO is not present");
        return -1;
    }

}
