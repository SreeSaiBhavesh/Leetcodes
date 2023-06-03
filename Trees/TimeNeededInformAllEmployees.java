class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dfs(i, informTime, manager));
        }
        return result;
    }
    private int dfs(int i, int[] informTime, int[] manager) {
        if (manager[i] != -1) {
            informTime[i] += dfs(manager[i], informTime, manager);
            manager[i] = -1;
        }
        return informTime[i];
    }
}