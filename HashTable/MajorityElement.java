class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();
        int result = 0;
        for(int num: nums){
            if(!elements.containsKey(num)){
                elements.put(num,1);
            }else{
                elements.put(num,elements.get(num)+1);
            }
            if(elements.get(num)>nums.length/2){
                result = num;
                break;
            }
        }
        return result;
    }
}