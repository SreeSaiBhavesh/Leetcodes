class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R') 
                qr.add(i);
            else 
                qd.add(i);
        }
        while(!qr.isEmpty() && !qd.isEmpty()){
            if(qr.poll()<qd.poll()){
                qr.add(n++);
            }else{
                qd.add(n++);
            }
        }
        return (qr.isEmpty()) ? ("Dire") : ("Radiant");
    }
}