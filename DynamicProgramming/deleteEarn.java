
class Solution {
    public int deleteAndEarn(int[] nums) {
       if (nums == null || nums.length == 0) {
           return 0;
       }
       int n = 10001;
       int[] values = new int[n];
       for (int num : nums) {
           values[num] += num;
       }
       int[] s0 = new int[n];
       int[] s1 = new int[n];
       s0[0] = 0;
       s1[0] = values[0];
       for (int i = 1; i < n; i++) {
           s0[i] = Math.max(s0[i - 1], s1[i - 1]);
           s1[i] = s0[i - 1] + values[i];
       }
        
       return Math.max(s0[n - 1], s1[n - 1]);
    
    }
}