class Solution {
    
    public int tribonacci(int n) {
        int a =0, b=1 , c=1,d ;
        d= a+b+c;
        if(n==0)
            return a;  
        if(n==1 || n==2)
            return b;
        for(int i =3 ; i<n ; i++){
            a=b;
            b=c;
            c=d;
            d = a+b+c;
        }
        return d ;
    }
}