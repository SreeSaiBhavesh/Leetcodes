class Solution {
    private int noOfWays(int i, int j, int m, int n, int dp[][]){
        if(i==m-1 && j==n-1) return 1;
        if(i>=m || j>=n) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }else{
            return dp[i][j] = noOfWays(i+1,j,m,n,dp) + noOfWays(i,j+1,m,n,dp);
        }
    }

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int ans = noOfWays(0,0,m,n,dp);
        if(m==1 && n==1){
            return ans;
        }
        return dp[0][0];
    }
}