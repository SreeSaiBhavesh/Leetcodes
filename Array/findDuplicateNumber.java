class Solution {
    public int findDuplicate(int[] nums) {
        int ptr1 = nums[0], ptr2 = nums[0];
        do{
            ptr1 = nums[ptr1];
            ptr2 = nums[nums[ptr2]];
        }while(ptr1 != ptr2);
        ptr2 = nums[0];
        while(ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}