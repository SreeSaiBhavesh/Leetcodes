<<<<<<< HEAD
class Solution {
    public int reachNumber(int target) {
        int k=0;
        target = Math.abs(target);
        while(target>0){
            k+=1;
            target-=k;
        }
        if(target%2==0){
            return k;
        }else{
            return k+1+k%2;
        }
    }
=======
class Solution {
    public int reachNumber(int target) {
        int k=0;
        target = Math.abs(target);
        while(target>0){
            k+=1;
            target-=k;
        }
        if(target%2==0){
            return k;
        }else{
            return k+1+k%2;
        }
    }
>>>>>>> 7dde52b849da2764cf339f6ce063e0108137e5ea
}