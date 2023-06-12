import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, long n) {
        // Write your code here
        
        long sn = (n*(n+1)) / 2;
        long s2n = (n*(n+1)*(2*n+1)) / 6;
        long s=0, s2=0;
        for(int i=0; i<n; i++){
            s+=arr.get(i);
            s2+= (long)arr.get(i) * (long)arr.get(i);
        }
        long val1 = s-sn; // x-y
        long val2 = s2-s2n;
        val2 = val2/val1; // x+y
        long x = (val1 + val2) / 2;
        long y = (x-val1);
        return new int[]{(int)y, (int)x};
    }
}