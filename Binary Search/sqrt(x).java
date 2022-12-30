<<<<<<< HEAD
class Solution {
    public int mySqrt(int x) {
        int high = x, low = 0;
		if(x<0)
            return -1;
        if(x == 0)
            return 0;
        if(x<4)
            return 1;

        low = 1;
        high = x;

        while(low < high) {
            int mid = low + (high - low) / 2;
            
            if(x / mid == mid) {
                return mid;
            } else if (x /mid > mid) {
                low = mid + 1;
            } else {
                high = mid; 
            }
        }
        
        return low - 1;
    }
=======
class Solution {
    public int mySqrt(int x) {
        int high = x, low = 0;
		if(x<0)
            return -1;
        if(x == 0)
            return 0;
        if(x<4)
            return 1;

        low = 1;
        high = x;

        while(low < high) {
            int mid = low + (high - low) / 2;
            
            if(x / mid == mid) {
                return mid;
            } else if (x /mid > mid) {
                low = mid + 1;
            } else {
                high = mid; 
            }
        }
        
        return low - 1;
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}