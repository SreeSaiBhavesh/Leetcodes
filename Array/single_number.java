<<<<<<< HEAD
class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int i:nums){
            n^=i;
        }
        return n;
    }
=======
class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int i:nums){
            n^=i;
        }
        return n;
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}