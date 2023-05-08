class Solution {
    public int arraySign(int[] nums) {
        boolean sign = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }else if(nums[i]<0){
                if(sign==false){
                    sign = true;
                }else{
                    sign = false;
                }
            }
        }
       
        return sign?1:-1;
    }
}