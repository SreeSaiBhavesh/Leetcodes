class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b)->(b.profit-a.profit));
        
        int max = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i].deadline > max){
                max = arr[i].deadline;
            }
        }
        
        int result[] = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            result[i] = -1;
        }
        
        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {
    
            for (int j = arr[i].deadline; j > 0; j--) {
    
                // Free slot found 
                if (result[j] == -1) {
                   result[j] = i;
                   countJobs++;
                   jobProfit += arr[i].profit;
                   break;
                }
            }
        }
    
        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;

    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/