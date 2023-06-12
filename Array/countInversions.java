import java.util.* ;

//import org.graalvm.compiler.lir.LIRInstruction.Temp;

import java.io.*; 
public class Solution {
    static long merge(long arr[], long temp[], long left, long mid, long right){
        long i,j,k;
        long cnt = 0;
        i=left; j=mid; k=left;
        while((i<=mid-1) && (j<=right)){
            if(arr[(int)i] <= arr[(int)j]){
                temp[(int)k++] = arr[(int)i++];
            }else{
                temp[(int)k++] = arr[(int)j++];
                cnt = cnt + (mid-i);
            }
        }
        
        while(i<=mid-1){
            temp[(int)k++] = arr[(int)i++];
        }
        
        while(j<=right){
            temp[(int)k++] = arr[(int)j++];
        }
        
        for(i=left; i<=right; i++){
            arr[(int)i] = temp[(int)i];
        }
        return cnt;
    }
    
    static long mergeSort(long arr[], long temp[], long left, long right){
        long mid, cnt = 0;
        if(left < right){
            mid = left + (right - left) / 2;
            cnt = mergeSort(arr,temp,left,mid);
            cnt += mergeSort(arr,temp,mid+1,right);
            cnt += merge(arr, temp, left, mid+1, right);
        }
        return cnt;
    }
    
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long temp[] = new long[(int)n];
        return mergeSort(arr,temp,0,n-1);
    }
}