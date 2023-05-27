class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        
        int pairs[][] = new int[nums1.length][2];
        for(int i=0;i<nums1.length;i++){
            pairs[i] = new int[] {nums2[i], nums1[i]};
        }
        Arrays.sort(pairs, (a,b)->b[0]-a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a,b)->a-b);
        long res = 0, sumS = 0;
        for(int[] pr: pairs){
            pq.add(pr[1]);
            sumS = (sumS+pr[1]);
            if(pq.size()>k) sumS-=pq.poll();
            if(pq.size()==k) res = Math.max(res, (sumS*pr[0]));
        }
        return res;
    }
}