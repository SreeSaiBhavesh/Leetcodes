<<<<<<< HEAD
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        return (len*(len+1))/2 - sum;
    }
=======
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        return (len*(len+1))/2 - sum;
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}