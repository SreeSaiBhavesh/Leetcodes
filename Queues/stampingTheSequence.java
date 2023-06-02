class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char sArray[] = stamp.toCharArray();
        char tArray[] = target.toCharArray();

        boolean visited[] = new boolean[target.length()];

        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        while(count < tArray.length){
            boolean flag = false;
            for(int i=0; i<=tArray.length-sArray.length; i++){
                if(!visited[i] && isPossible(tArray, i, sArray)){
                    count = doReplace(tArray, sArray.length,count, i);
                    flag = true;
                    visited[i] = true;
                    result.add(i);
                    if(count == tArray.length){
                        break;
                    }
                }
            }
            if(!flag){
                return new int[0];
            }
        }
        int resArray[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
            resArray[i] = result.get(result.size()-i-1);
        }
        return resArray;
    }

    public boolean isPossible(char[] target, int p, char[] stamp){
        for(int i=0; i<stamp.length;i++){
            if(target[i+p]!='?' && target[i+p]!=stamp[i]){
                return false;
            }
        }
        return true;
    }

    public int doReplace(char[] T, int len, int count, int p){
        for(int i=0;i<len;i++){
            if(T[i+p] != '?'){
                T[i+p] = '?';
                count++;
            }
        }
        return count;
    }
}