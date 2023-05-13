class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int res = 0, mod = (int)1e9 +7;
        int dp[] = new int[high+1];
        dp[0] = 1;
        for(int i=Math.min(zero,one);i<=high;i++){
            if(i>=zero){
                dp[i] = (dp[i] + dp[i-zero]) % mod;
            }if(i>=one){
                dp[i] = (dp[i] + dp[i-one]) % mod;
            }
        }
        for(int i=low;i<=high;i++){
            res=(res+dp[i]) % mod;
        }
        return res;
    }
}