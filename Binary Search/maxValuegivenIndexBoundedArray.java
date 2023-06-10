class Solution {
    public int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int left = 0, right = maxSum, mid;
        while(left<right){
            mid = (left+right+1)/2;
            if(check(n,index,mid)<=maxSum){
                left = mid;
            }
            else{
                right = mid - 1;
            }
        }
        return left+1;
    }

    private long check(int n, int index, int maxNum){
        int b = Math.max(maxNum-index,0);
        long res = (long)(maxNum+b)*(maxNum-b+1)/2;
        b = Math.max(maxNum-(n-1-index),0);
        res += (long)(maxNum+b)*(maxNum-b+1)/2;
        return res-maxNum;
    }
}