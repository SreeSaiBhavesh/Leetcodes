import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, long n) {
        // Write your code here
        
        int xr = 0;
        for(int i=0; i<n; i++){
            xr = xr ^ arr.get(i);
            xr = xr ^ (i+1);
        }
        int bitNo = 0;
        while(true){
            if((xr & (1<<bitNo)) != 0){
                break;
            }
            bitNo++;
        }
        int zero = 0;
        int one = 0;
        for(int i=0; i<n; i++){
            if((arr.get(i) & (1<<bitNo)) != 0){
                one = one ^ arr.get(i);
            }else{
                zero = zero ^ arr.get(i);
            }
        }

        for(int i=1; i<=n; i++){
            if((i & (1<<bitNo)) != 0){
                one = one ^ i;
            }else{
                zero = zero ^ i;
            }
        }
        
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr.get(i) == zero) cnt++;
        }
        if(cnt == 2) return new int[]{one,zero};
        return new int[]{zero,one};
    }
}