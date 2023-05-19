class Solution {
    public int maxArea(int[] height) {
        int maxArea  = 0, start = 0, end = height.length-1;
        // while(start<end){
        //     maxArea = Math.max(maxArea, Math.min(height[start], height[end]) * (end-start));
        //     if (height[start] < height[end]) {
        //         start++;
        //     } else {
        //         end--;
        //     }
        // }
        for(int i=0;i<height.length;i++){
            if(height[start]<height[end]){
                maxArea = Math.max(maxArea, (end-start)*height[start]);
                start++;
            }else{
                maxArea = Math.max(maxArea, (end-start)*height[end]);
                end--;
            }
        }
        return maxArea;
    }
}