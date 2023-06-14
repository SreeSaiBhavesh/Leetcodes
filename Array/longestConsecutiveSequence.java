class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int cnt = 1;
        int max = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]==nums[i]+1){
                cnt += 1;
                max = Math.max(max,cnt);
            }else if(nums[i+1] == nums[i]){
                continue;
            }else{
                cnt = 1;
            }
        }
        return max;
    }
}