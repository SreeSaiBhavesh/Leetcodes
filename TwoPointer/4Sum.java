class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();

        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1; j<nums.length; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                int low = j+1, high = nums.length-1;
                
                while(low < high){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[low];
                    sum += nums[high];
                    if(sum == target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++; high--;
                        while(low<high && nums[low] == nums[low-1]) low++;
                        while(low<high && nums[high] == nums[high+1]) high--;
                        
                    }else if(sum<target) low++;
                    else high--;
                }
            }
        }
        
        return list;
    }
}