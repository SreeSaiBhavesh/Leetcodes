class activity{
    int start;
    int end;
    public activity(int start, int end){
        this.start = start;
        this.end = end;
    }
}

class ActivityComparator implements Comparator<activity>
{
    public int compare(activity a1, activity a2){
        return a1.end - a2.end;
    }
}

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        ArrayList<activity> meet = new ArrayList<>();
        for(int i = 0; i < start.size(); i++)
            meet.add(new activity(start.get(i), end.get(i)));
        
        ActivityComparator ac = new ActivityComparator();
        Collections.sort(meet, ac);

        int ans = 1;
        int limit = meet.get(0).end; 
        
        for(int i=1; i<meet.size(); i++) {
            if(meet.get(i).start >= limit) {
                limit = meet.get(i).end; 
                ans++;
            }
        }
        return ans;
    }
}