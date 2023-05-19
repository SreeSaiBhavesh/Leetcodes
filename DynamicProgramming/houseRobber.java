class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        for(int i=nums.length-1;i>=0;i--){
            int nextPoint = (i+2>nums.length)?0:dp[i+2];
            dp[i] = Math.max(nums[i]+nextPoint, dp[i+1]);
        }
        return dp[0];
    }
}