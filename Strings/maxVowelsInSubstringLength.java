class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int ch;
        int vowels = 0;
        int max = 0;
        while(j < k)
        {       
            ch = s.charAt(j);    
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            j++;
        }
        max = vowels;
        while(j < s.length())
        {
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels--;
            ch = s.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;

            max = Math.max(max, vowels);
            i++;
            j++;
        }
        return max;
    }
}