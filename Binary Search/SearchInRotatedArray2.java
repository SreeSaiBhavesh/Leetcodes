<<<<<<< HEAD
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l=0,h=n-1,mid;

         
        while(l <= h)
        {
            mid = l + (h-l) / 2;
            if (nums[mid] == target)
                return true;
			
            if((nums[l] == nums[mid]) && (nums[h] == nums[mid]))
            {
                l++;
                h--;
            }
			
            else if(nums[l] <= nums[mid])
            {
                if((nums[l] <= target) && (nums[mid] > target))
                    h = mid - 1;
                else
                    l = mid + 1;
            }
			
            else
            {
                if((nums[mid] < target) && (nums[h]>= target))
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return false;
    }

    
=======
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l=0,h=n-1,mid;

         
        while(l <= h)
        {
            mid = l + (h-l) / 2;
            if (nums[mid] == target)
                return true;
			
            if((nums[l] == nums[mid]) && (nums[h] == nums[mid]))
            {
                l++;
                h--;
            }
			
            else if(nums[l] <= nums[mid])
            {
                if((nums[l] <= target) && (nums[mid] > target))
                    h = mid - 1;
                else
                    l = mid + 1;
            }
			
            else
            {
                if((nums[mid] < target) && (nums[h]>= target))
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return false;
    }

    
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}