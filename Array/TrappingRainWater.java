class Solution {
    public int trap(int[] height) {
        int lc = 0, lmax = 0, rc = 0, rmax = 0, water = 0;
        rc = height.length-1;
        while(lc<rc){
            if(height[lc]<=height[rc]){
                if(height[lc]>lmax){
                    lmax = height[lc];
                }else{
                    water += lmax - height[lc];
                }
                lc++;
            }else{
                if(height[rc]>rmax)
                    rmax = height[rc];
                else
                    water += rmax-height[rc];           
                rc--;
            }
        }
        return water;
    }
}