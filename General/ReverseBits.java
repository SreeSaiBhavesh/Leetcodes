<<<<<<< HEAD
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int a = 1;
        for (int i = 0; i < 32; i ++) {
            int digit = n & a;
            result = (result << 1);
            if (digit != 0) {
                 result = result + 1;
            }
            a = (a << 1);
        }
        return result;
    }
=======
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int a = 1;
        for (int i = 0; i < 32; i ++) {
            int digit = n & a;
            result = (result << 1);
            if (digit != 0) {
                 result = result + 1;
            }
            a = (a << 1);
        }
        return result;
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}