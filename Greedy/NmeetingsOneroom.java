class meeting{
    int start;
    int end;
    int pos;
    
    meeting(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meeting>
{
    public int compare(meeting o1, meeting o2){
        if(o1.end < o2.end)
            return -1;
        else if(o1.end>o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1;
    }
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i=0; i<start.length; i++){
            meet.add(new meeting(start[i], end[i], i+1));
        }
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;
        
        for(int i=1; i<start.length; i++){
            if(meet.get(i).start > limit){
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }
        return answer.size();
    }
}