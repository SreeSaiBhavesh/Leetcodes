<<<<<<< HEAD
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        int l=0,h=n-1,mid;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>target){
                    h = mid-1;
                }else{
                    l = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[h]){
                    l = mid+1;
                }
                else{
                    h = mid-1;
                }
            }
            
        }
        return -1;
    }
=======
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        int l=0,h=n-1,mid;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>target){
                    h = mid-1;
                }else{
                    l = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[h]){
                    l = mid+1;
                }
                else{
                    h = mid-1;
                }
            }
            
        }
        return -1;
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
};