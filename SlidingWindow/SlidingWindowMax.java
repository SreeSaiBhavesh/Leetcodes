class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> window = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){


            while(!window.isEmpty() && nums[window.getLast()]<= nums[i]){
                window.removeLast();
            }
            window.addLast(i);
            if(window.getFirst()==i-k)
                window.removeFirst();
            if(i>=k-1)
                result.add(nums[window.peek()]);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}