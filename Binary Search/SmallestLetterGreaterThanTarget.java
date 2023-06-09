class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        if(target>=letters[n-1])
            return letters[0];
        else
            target++;
        int low = 0, high = n-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(letters[mid] == target) return letters[mid];
            if(letters[mid] < target) low = mid + 1;
            else high = mid;
        } 
        return letters[high];
    }
}