public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0,h = n, mid, ans = -1;
        while(l<=h){
            mid = l+(h-l)/2;
            if(isBadVersion(mid)==true){
                ans = mid;
                h = mid -1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}