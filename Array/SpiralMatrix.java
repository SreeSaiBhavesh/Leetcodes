class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0) {
            return res;
        }
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int startRow = 0;
        int endRow = rowCount - 1;
        int startCol = 0;
        int endCol = colCount - 1;
       
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol; i++){
                res.add(matrix[startRow][i]);
            }
            startRow++;
            for(int i=startRow;i<=endRow; i++){
                res.add(matrix[i][endCol]);
                
            }
            endCol--;
            if(startRow<=endRow){
                for(int i=endCol;  i>=startCol;i--){
                    res.add(matrix[endRow][i]);
                }
                endRow--;
            }
            if(startCol<=endCol){
                for(int i=endRow; i>=startRow;i--){
                    res.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return res;

    }
}