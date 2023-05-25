class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int count;
        Stack<Integer> stack = new Stack<Integer>();
        int ans[] = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            ans[i] = 0;
        }
        for(int i=heights.length-1;i>=0;i--){
            count = 0;
            
            while(!stack.isEmpty() && heights[i]>stack.peek()){
                count++;
                stack.pop();
                
            }
            if(!stack.isEmpty())
                count++;
            
            stack.push(heights[i]);
            heights[i] = count;
        }
        return heights;
    }
}