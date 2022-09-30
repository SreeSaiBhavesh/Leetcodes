public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0,h=n,mid,ans=-1;
        while(l<=h){
            mid = l+(h-l)/2;
            if(guess(mid)==-1){
                h = mid-1;
            }else if(guess(mid)==1){
                l = mid+1;
            }else{
                ans = mid;
                break;
            }
        }
        return ans;
    }
}