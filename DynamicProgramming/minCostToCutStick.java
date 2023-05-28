class Solution {
    public int minCost(int n, int[] cuts) {
        int temp[] = new int[cuts.length+2];
        temp[0] = 0;
        
        for(int i = 1; i< temp.length-1; i++){
            temp[i] = cuts[i-1];
        }
        
        temp[temp.length-1] = n;
        Arrays.sort(temp);
        
        int dp[][] = new int[temp.length+2][temp.length+2];
        
        for(int a[]: dp)
            Arrays.fill(a, 0);
        
        for(int i = cuts.length; i >= 1; i--){
            for(int j = 1; j <= cuts.length; j++){
                if(i > j)
                    continue;
                int minCost = Integer.MAX_VALUE;
                for(int ind = i; ind <= j; ind++){
                    int cost = temp[j+1] - temp[i-1] + dp[i][ind-1] + dp[ind+1][j];
                    minCost = Math.min(cost, minCost);
                }
                dp[i][j] = minCost;
            }
        }
        
        return dp[1][cuts.length];
    }
}