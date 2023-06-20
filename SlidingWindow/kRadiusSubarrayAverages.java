class Solution {
    public int[] getAverages(int[] nums, int k) {
        int windowSize = 2*k+1;
        int n = nums.length;
        long windowSum = 0;
        int result[] = new int[n];
        for(int i=0; i<n; i++){
            result[i] = -1;
        }
        if(k==0){
            return nums;
        }
        if(k>(n/2)){
            for(int i=0; i<nums.length; i++){
                nums[i] = -1;
            }
            return nums;
        }

        for(int i=0; i<n; i++){
            windowSum += nums[i];

            if(i-windowSize >= 0){
                windowSum -= nums[i-windowSize];
            }
            
            if(i>=windowSize - 1){
                result[i-k] = (int)(windowSum/windowSize);
            }
        }
        return result;
    }
}