class Solution {
    public long mostPoints(int[][] questions) {
        long dp[] = new long[questions.length+1];
        for(int i=questions.length-1;i>=0;i--){
            int points = questions[i][0];
            int bp = questions[i][1];
            int nextIndex = i+bp+1;
            long nextPoints = nextIndex < questions.length ? dp[nextIndex] : 0;
            dp[i] = Math.max(points + nextPoints, dp[i + 1]);
        }
        return dp[0];
    }
}

