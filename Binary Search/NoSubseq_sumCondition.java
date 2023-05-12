class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0, n = nums.length, left = 0, right = n - 1, mod = (int)1e9 + 7;
        int p[] = new int[n];
        p[0] = 1;
        for(int i = 1;i<n;i++){
            p[i]=p[i-1]*2 % mod;
        }
        while(left<=right){
            if(nums[left]+nums[right]>target){
                right--;
            }else{
                res= (res+p[right-left++]) % mod;
            }
        }
        return res;
    }
}