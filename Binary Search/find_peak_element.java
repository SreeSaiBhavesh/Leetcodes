class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, h = nums.length-1;
        int mid;
        while(l<=h){
            mid = l+(h-l)/2;
            if((mid==0 || nums[mid-1]<=nums[mid]) && (mid==nums.length-1 || nums[mid+1]<=nums[mid])){
                return mid;
            }
               else if(mid>0 && nums[mid-1]>nums[mid]){
                   h = mid-1;
               }
               else{
                   l = mid+1;
               }
        }
        return l;
    }
}