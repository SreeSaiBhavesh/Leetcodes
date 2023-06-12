class Solution {
    private static List<Integer> rowPascal(int row){
        long ans = 1;
        ArrayList<Integer> ansRow = new ArrayList<Integer>();
        //long ansRow[] = new long[row];
        ansRow.add(1);
        for(int i=1; i<row; i++){
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        //int ans[][] = new int[n][n];
        for(int i=0; i<n; i++){
            ans.add(rowPascal(i+1));
        }
        return ans;
        
    }
}