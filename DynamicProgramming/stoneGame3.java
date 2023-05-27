class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int i_0 = 0, i_1 = 0, i_2 = 0;
        int n = stoneValue.length;
        int i = n-1;
        while(i>=0){
            int ans = Integer.MIN_VALUE;
            ans = Math.max(ans, stoneValue[i]-i_0);
            if(i+1<n) ans = Math.max(ans, stoneValue[i]+stoneValue[i+1]-i_1);
            if(i+2<n) ans = Math.max(ans, stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-i_2);
            i_2 = i_1;
            i_1 = i_0;
            i_0 = ans;
            i--;
        }
        int alice = i_0;
        if(alice>0) return "Alice";
        if(alice==0) return "Tie";
        else return "Bob";
    }
}