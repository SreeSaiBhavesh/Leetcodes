class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //int ans[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=i; j<cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols-1-j];
                matrix[i][cols-1-j] = temp;
            }
        }
    }
}