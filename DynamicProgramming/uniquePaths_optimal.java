class Solution {
    public int uniquePaths(int m, int n) {
        // answer = (m+n-2) C (n-1)  or (m+n-2) C (m-1)
        double ans = 1;
        int a = (m+n-2);
        for(int i=1; i<=m-1; i++){
            ans = ans * (a-(m-1)+i);
            ans = ans / i;
        }
        return (int)ans;
    }
}