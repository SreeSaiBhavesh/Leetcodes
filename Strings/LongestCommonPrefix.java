<<<<<<< HEAD
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
=======
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}