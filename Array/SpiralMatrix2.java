class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int top = 0, left = 0, bottom = n-1, right=n-1;
        int count = 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                res[top][i]=count;
                count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[i][right]=count;
                count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                res[bottom][i]=count;
                count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                res[i][left]=count;
                count++;
            }
            left++;
        }
        return res;

    }
}