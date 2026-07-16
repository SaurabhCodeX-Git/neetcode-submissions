class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int n = heights.length;
        int right = n-1;
        int ans = 0;
        while(left<right){
            int width = right - left;
            int currentWater = Math.min(heights[left], heights[right])*width;
            ans=Math.max(currentWater, ans);

            if(heights[left]<= heights[right]){
                left++;
            }else{
                right--;
            }

        }
    return ans;
    }
}
