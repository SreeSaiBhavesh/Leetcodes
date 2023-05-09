class Solution {
    int index;
    int[][] res;
    private void add (int r, int c, int R, int C) {
        if (r >= R || r < 0 || c >= C || c < 0) return;
        res[index][0] = r;
        res[index++][1] = c;
    }

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int r = rStart, c = cStart, len = 1;
        res = new int[rows * cols][2];
        while (index < (rows * cols )) {         
            for (int k = 0; k < len; k++) add(r, c++, rows, cols);          
            for (int k = 0; k < len; k++) add(r++, c, rows, cols);
            len++;
            for (int k = 0; k < len; k++) add(r, c--, rows, cols);
            for (int k = 0; k < len; k++) add(r--, c, rows, cols);
            len++;   
        }
        return res;
    }
}