class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int left = 0, right = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right < s.length()){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right))+1, left);
            map.put(s.charAt(right),right);
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
}