class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if(n==1){
            return 0;
        }
        //int ans[] = new int[informTime.length];
        for(int i=0; i<manager.length; i++){
            if(manager[i] != -1){
                int presentManager = manager[i];
                while(presentManager != -1){
                    informTime[i]+=informTime[presentManager];
                    presentManager = manager[presentManager];    
                }
                manager[i] = -1;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<informTime.length; i++){
            if(informTime[i]>max){
                max = informTime[i];
            }
        }
        return max;
    }
}