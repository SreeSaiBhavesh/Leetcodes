class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int max = 2;
        HashMap<Integer, Integer> hmap[] = new HashMap[n];

        for(int i=0;i <nums.length; i++){
            hmap[i] = new HashMap<>();
            for(int j=0; j<i; j++){
                int diff = nums[i] - nums[j];
                hmap[i].put(diff, hmap[j].getOrDefault(diff, 1)+1);
                max = Math.max(max, hmap[i].get(diff));
            }
            
        }
        
        return max;
    }
}