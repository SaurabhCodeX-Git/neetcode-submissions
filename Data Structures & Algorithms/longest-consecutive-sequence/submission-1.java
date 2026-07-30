class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i]-1)){
                int currentStreak = 1;
                int currNum = nums[i];

                while(set.contains(currNum+1)){
                    currentStreak++;
                    currNum = currNum+1;
                }
                result = Math.max(result, currentStreak);
            }
        }
        return result;
    }
}
