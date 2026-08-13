class Solution {
    public int search(int[] arr, int target) {
        int n= arr.length;
        int lo=0, hi=n-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target){
                ans = mid;
            } 
            // 7 8 0 1 2 3 4 5 6
            if(arr[mid]>= arr[lo]){
                if(arr[mid]>target && target>=arr[lo]){
                    hi = mid -1;
                }else{
                    lo = mid+1;
                }
            }else{
                if(arr[mid]<target && target <= arr[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
            
        }
        return ans;

    }
}
