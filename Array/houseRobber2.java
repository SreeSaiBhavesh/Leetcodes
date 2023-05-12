class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[nums.length-1],nums[nums.length-2]);
        int nums2[] = new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i!=0)nums2[i-1]=nums[i];
        }
        for(int i=2;i<nums2.length;i++){
            nums[i]+=(i-3>=0)?Math.max(nums[i-2],nums[i-3]):nums[i-2];
            nums2[i]+=(i-3>=0)?Math.max(nums2[i-2],nums2[i-3]):nums2[i-2];
        }
        return Math.max(Math.max(nums[nums.length-2],nums[nums.length-3]),Math.max(nums2[nums2.length-1],nums2[nums2.length-2]));
  
    }
}