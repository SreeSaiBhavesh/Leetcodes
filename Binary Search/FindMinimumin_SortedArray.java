<<<<<<< HEAD
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums[left]<nums[right])return nums[0];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];// yeh part sorted hai
            if(nums[mid-1]>nums[mid])
                return nums[mid];
            if(nums[mid]>nums[0]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;
        
        
    
    }
=======
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums[left]<nums[right])return nums[0];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];// yeh part sorted hai
            if(nums[mid-1]>nums[mid])
                return nums[mid];
            if(nums[mid]>nums[0]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;
        
        
    
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}