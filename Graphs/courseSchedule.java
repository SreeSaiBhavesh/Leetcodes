class Solution {
    public boolean dfs(int node, List<List<Integer>> adj, boolean visit[], boolean inStack[]){
        if(inStack[node]) return true;

        if(visit[node]) return false;

        visit[node] = true;
        inStack[node] = true;
        for(int neighbor : adj.get(node)){
            if(dfs(neighbor, adj, visit, inStack)) return true;
        }

        inStack[node] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int prerequisite[] : prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }

        boolean visit[] = new boolean[numCourses];
        boolean inStack[] = new boolean[numCourses];
        for(int i=0; i<numCourses; i++){
            if(dfs(i, adj, visit, inStack)){
                return false;
            }
        }
        return true;
    }
}