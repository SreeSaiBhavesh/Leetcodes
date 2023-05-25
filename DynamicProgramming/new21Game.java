class Solution {
    public double new21Game(int n, int k, int maxPts) {
        double dp[] = new double[k+maxPts];
        if(k==0 || n>=k+maxPts)
            return 1.0;
        double windowSum = 0;
        for(int i=k;i<k+maxPts;i++){
            if(i<=n)
                windowSum+=1;
        }
        for(int i=k-1;i>=0;i--){
            dp[i] = windowSum/maxPts;
            double remove = 0;
            if(i+maxPts<=n){
                if(dp[i+maxPts]>0)
                    remove = dp[i+maxPts];
                else
                    remove = 1;
            }
                
            windowSum+=dp[i]-remove;
        }
        return dp[0];
        
    }
}