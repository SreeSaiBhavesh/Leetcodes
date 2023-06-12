class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)
            return 1;
        int trusts[], trustedBy[];

        trusts = new int[n+1];
        trustedBy = new int[n+1];

        for(int i=0; i<trust.length; i++){

            trusts[trust[i][0]]++;
            trustedBy[trust[i][1]]++;
        }
        for(int i=0; i<n+1; i++){
            if(trusts[i] == 0 && trustedBy[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}