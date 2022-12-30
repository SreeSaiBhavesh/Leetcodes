class Solution {
public:
    int mySqrt(int x) {
        if(x==1) return 1;
        if(x==0) return 0;
        long long l=1, h=x/2;
        long long ans;
        while(l<=h){
            long long mid = l+(h-l)/2;
            long long sqr = mid*mid;
            if(sqr>x){
                h = mid-1;
            }else if(sqr<x){
                ans = mid;
                l = mid+1;
            }else{
                return mid;
            }
        }
        return ans;
    }
};