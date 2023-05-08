class Solution {
    public double average(int[] salary) {
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        double sum = 0;
        for(int i=0;i<salary.length;i++){
            if(max<salary[i]){
                max = salary[i];
            }if(min>salary[i]){
                min = salary[i];
            }
            sum+=salary[i];
        }
        
        sum = (sum-min-max)/(salary.length-2);
        return sum;
    }
}