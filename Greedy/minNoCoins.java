public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int count = 0;
        int dp[] = {1,2,5,10,20,50,100,500,1000};

        for(int i=dp.length-1; i>=0; i--){
            while(amount >= dp[i]){
                amount -= dp[i];
                count++;
            }
        }
        return count;
    }
}
