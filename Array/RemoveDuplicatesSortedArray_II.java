class Solution {
    public int removeDuplicates(int[] nums) {
        int a = nums.length;
        for(int i=nums.length-2;i>0;i--){
            if(nums[i+1] == nums[i] && nums[i] == nums[i-1]){
                nums[i-1] = nums[i+1];
                nums[i] = nums[i+1];
                for(int j=i+1;j<a-1;j++)
                {
                    nums[j] = nums[j+1];
                }
                
                a= a-1;
            }
        }
        return a;
    }
}