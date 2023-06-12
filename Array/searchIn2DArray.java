import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        if(mat.get(0).get(0) == target){
            return true;
        }
        int l=0, r=mat.size()-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(mat.get(mid).get(0)>target){
                r=mid;
            }else if(mat.get(mid).get(0)<target){
                l=mid+1;
                if(l==r){
                    if(mat.get(l).get(0)==target){
                        return true;
                    }else if(mat.get(l).get(0)<target){
                        r = r+1;
                        break;
                    }
                }
            }else{
                return true;
            }
        }
        if(r-1==-1){
            r++;
        }
        int l2=0, r2=mat.get(0).size()-1;
        while(l2<r2){
            int mid2 = l2+(r2-l2)/2;
            if(mat.get(r-1).get(mid2)==target){
                return true;
            }
            else if(mat.get(r-1).get(mid2)>target){
                r2=mid2;
            }else if(mat.get(r-1).get(mid2)<target){
                l2=mid2+1;
                if(l2==r2){
                    if(mat.get(r-1).get(l2)==target){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
