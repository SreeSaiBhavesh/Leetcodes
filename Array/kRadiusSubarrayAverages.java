class Solution {
    public int[] getAverages(int[] nums, int k) {
        int windowSize = 2*k+1;
        if(k==0){
            return nums;
        }
        if(k>(nums.length/2)){
            for(int i=0; i<nums.length; i++){
                nums[i] = -1;
            }
            return nums;
        }
        long prefixSum[] = new long[nums.length+1];
        for(int i=0; i<nums.length; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        for(int i=0; i<k; i++){
            nums[i] = -1;
        }
        for(int i=k; i+k<nums.length; i++){
            nums[i] = (int)((prefixSum[i+k+1] - prefixSum[i-k])/windowSize);
        }
        for(int i=nums.length-k; i<nums.length; i++){
            nums[i] = -1;
        }
        return nums;
    }
}