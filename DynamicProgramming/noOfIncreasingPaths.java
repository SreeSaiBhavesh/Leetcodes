class Solution {
    private long[][] dp;
    private int mod = 1_000_000_007;

    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        dp = new long[m][n];

        long ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans = (ans + dfs(grid,i,j,0)) % mod;
            }
        }
        return (int)ans;
    }

    private long dfs(int[][] grid, int i, int j, int prevVal){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return 0;
        if(grid[i][j]<=prevVal) return 0;
        if(dp[i][j]>0) return dp[i][j];
        dp[i][j] = 1;

        long bottom = dfs(grid,i+1,j,grid[i][j]);
        long right = dfs(grid,i,j+1,grid[i][j]);
        long top = dfs(grid,i-1,j,grid[i][j]);
        long left = dfs(grid,i,j-1,grid[i][j]);
        dp[i][j] = (dp[i][j] + right + bottom + top + left) % mod;
        return dp[i][j];
    }
}