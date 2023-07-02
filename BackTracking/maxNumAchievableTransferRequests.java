class Solution {
    int ans = 0;

    public void maxRequests(int requests[][], int degree[], int n, int index, int count){
        if(index == requests.length){
            for(int i=0; i<n; i++){
                if(degree[i] != 0){
                    return;
                }
            }
            ans = Math.max(ans, count);
            return;
        }

        degree[requests[index][0]]--;
        degree[requests[index][1]]++;

        maxRequests(requests, degree, n, index+1, count+1);

        degree[requests[index][0]]++;
        degree[requests[index][1]]--;

        maxRequests(requests, degree, n, index+1, count);
    }

    public int maximumRequests(int n, int[][] requests) {
        int degree[] = new int[n];
        //int ans=0;
        maxRequests(requests, degree, n, 0, 0);
        return ans;
    }
}