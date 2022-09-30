class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,h=numbers.length-1;
        int res[] = new int[2];
         while(l<h){
            if(numbers[l]+numbers[h]==target){
                res[0] = l+1;
                res[1] = h+1;
                return res;
            }else if(numbers[l]+numbers[h]>target){
                h--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}