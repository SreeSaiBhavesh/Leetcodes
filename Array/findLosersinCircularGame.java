class Solution {
    public int[] circularGameLosers(int n, int k) {
        int receive[] = new int[n];
        int i=0,cnt=1;
        while(true){
            receive[i]++;
            if(receive[i]==2) break;
            i = (i + (cnt * k)) % n;
            cnt++;
        }
        int len=0;
        for(int num : receive) if(num == 0) len++;

        int index = 0, ans[] = new int[len];
        for(int j=0;j<n;j++){
          if(receive[j] == 0) ans[index++] = j+1;  
        }
        return ans;
    }
}