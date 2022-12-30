class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        else{
            int r=0;
            int temp=x;
            while(temp!=0){
                if(temp==0){
                    return true;

                }
                else{
                    r = r*10+temp%10;
                    temp = temp/10;
                }


            }
            if(r==x){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}