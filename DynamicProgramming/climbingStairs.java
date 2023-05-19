class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        int res = 0;
        dp[0] = 1;
        dp[1] = 1;
        int arr[] = new int[2];
        arr[0] = arr[1] = 1;
        if(n>=2){
            dp[2] = 2;
            for(int i=3;i<=n;i++){
                dp[i] = dp[i-1]+arr[1];
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1]=arr[1]+temp;
            }
        }
        
        return dp[n];
    }
}