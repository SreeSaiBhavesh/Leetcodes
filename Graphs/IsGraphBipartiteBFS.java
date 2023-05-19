class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        for(int i=0;i<n;i++) colors[i] = -1;
        for(int i=0;i<n;i++){
            if(colors[i]==-1){
                if(check(i,graph,colors)==false){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check(int start, int[][] graph, int[] colors){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        colors[start] = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int i: graph[node]){
                if(colors[i]==-1){
                    colors[i] = 1-colors[node];
                    q.add(i);
                }else if(colors[i]==colors[node]){
                    return false;
                }
            }
        }
        return true;
    }
}