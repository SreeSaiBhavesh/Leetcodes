class Solution {
    ArrayList<ArrayList<Integer>> path;
    int result[];
    public int[] gardenNoAdj(int n, int[][] paths) {    
        result = new int[n];
        path = new ArrayList(n);
        for(int i=0; i<n; i++){
            path.add(new ArrayList());
        }

        for(int p[]: paths){
            path.get(p[0]-1).add(p[1]-1);
            path.get(p[1]-1).add(p[0]-1);
        }        

        for(int i=0; i<n; i++){
            if(result[i] == 0)
                bfs(i);
        }
        return result;
    }

    private void bfs(int i){
        Queue<Integer> queue = new LinkedList();
        queue.add(i);
        result[i] = 1;

        while(!queue.isEmpty()){
            int u = queue.poll();
            int flower = result[u];

            for(int v: path.get(u)){
                if(result[v]==0 || result[v]==flower){
                    result[v] = (flower%4)+1;
                    queue.add(v);
                }
            }
        }
    }
}