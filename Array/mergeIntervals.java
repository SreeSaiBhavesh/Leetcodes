class Solution {
    public int[][] merge(int[][] intervals) {
        //ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        

        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i]==null){
                break;
            }
            if(intervals[i][1]>=intervals[i+1][0]){
                //ans.add(new int[]{intervals[i][0],intervals[i+1][1]});
                intervals[i][0] = intervals[i][0];
                intervals[i][1] = Math.max(intervals[i+1][1],intervals[i][1]);
                intervals[i+1]=intervals[i];
                intervals[i] = null;
            }
            
        }
        int j=0;
        
        for(int i=0; i<intervals.length;i++){
            if(intervals[i]!=null){
                intervals[j]=intervals[i];
                j++;
            }
        }
        int ans[][] = new int[j][2];
        for(int i=0;i<j;i++){
            ans[i]=intervals[i];
        }
        return ans;
        // int arr[][] =  new int[ans.size()][];
        // for(int i=0;i<ans.size();i++) {
        //    	int a[] =  new int[2];
        //    	for(int j=0;j<2;j++) {
        //    		a[j] =  ans.get(i)[j];
        //    	}
        //     arr[i] =  a;
        // }   
           
        // return arr;
    }
}