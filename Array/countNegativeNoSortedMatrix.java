class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, col = grid[0].length, r = rows - 1, c = 0, cnt = 0;
        while(r>=0 && c<col){
            if(grid[r][c] < 0){
                --r;
                cnt += col - c;
            }else{
                ++c;
            }
        }
        return cnt;
    }
}