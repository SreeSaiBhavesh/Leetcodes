class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, sum=0;
        for(int i=0; i<gain.length; i++){
            sum+=gain[i];
            max = Math.max(sum,max);
        }
        return max;
    }
}