class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        for(int i=0;i<n;i++) colors[i] = -1;
        for(int i=0;i<n;i++){
            if(colors[i]==-1){
                if(check(i,0,graph,colors)==false){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check(int start, int color, int[][] graph, int[] colors){
        colors[start] = color;
        
        for(int i: graph[start]){
            if(colors[i]==-1){
                if(check(i,1-color,graph,colors)==false){
                    return false;
                }
            }else if(colors[i]==colors[start]){
                return false;
            }
        }
        
        return true;
    }
}