class Solution {
    public int maximumDetonation(int[][] bombs) {
        int max = 0;

        for(int i=0; i<bombs.length; i++){
            max = Math.max(max, getMaxBFS(bombs, i));
        }
        return max;
    }

    private int getMaxBFS(int[][] bombs, int index){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[bombs.length];

        visited[index] = true;
        queue.offer(index);
        
        int count = 1;
        while(!queue.isEmpty()){
            int currBomb = queue.poll();
            for(int j=0; j<bombs.length; j++){
                if(!visited[j] && isInRange(bombs[currBomb], bombs[j])){
                    visited[j] = true;
                    count++;
                    queue.offer(j);
                }
            }
        }
        return count;
    }

    private boolean isInRange(int point1[], int point2[]){
        long dx = point1[0] - point2[0], dy = point1[1] - point2[1], radius = point1[2];
        long distance = dx*dx+dy*dy;
        return distance <= radius*radius;
    }
}