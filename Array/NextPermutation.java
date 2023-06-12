class Solution {
    // private void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }

    public void nextPermutation(int[] nums) {

        // Observation 1 -> Finding Break point
        int index = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            Arrays.sort(nums);
        }

        // Observation 2 -> Swaping index number with its next higher number in array
        else{
            for(int i=nums.length-1; i>index; i--){
                if(nums[i]>nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    //swap(nums[i],nums[index]);
                    break;
                }
            }

            // Obervation 3 -> sort the array after index to get next permutation
            Arrays.sort(nums,index+1,nums.length);
        }
    }
}