class UndergroundSystem {
    HashMap<Integer, checkInInfo> checkIn;
    HashMap<String, TravelInfo> checkOut;
    public UndergroundSystem() {
        checkIn = new HashMap<>();
        checkOut = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, new checkInInfo(stationName, t));
    }

    public class checkInInfo{
        String stationName;
        int checkInTime;
        public checkInInfo(String stationName, int checkInTime) {
            this.stationName = stationName;
            this.checkInTime = checkInTime;
        }
    }

    public class TravelInfo{
        int TravelTime;
        int count;
        public TravelInfo(int TravelTime, int count){
            this.TravelTime = TravelTime;
            this.count = count;
        }
    }
    
    public void checkOut(int id, String stationName, int t) {
        checkInInfo info = checkIn.remove(id);
        String travel = info.stationName+"-"+stationName;
        int travelTime = t - info.checkInTime;
        if (checkOut.containsKey(travel)) {
            TravelInfo travelInfo = checkOut.get(travel);
            travelInfo.TravelTime += travelTime;
            travelInfo.count++;
        } else {
            checkOut.put(travel, new TravelInfo(travelTime, 1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String travel = startStation+"-"+endStation;
        TravelInfo travelInfo = checkOut.get(travel);
        return (double) travelInfo.TravelTime / travelInfo.count;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */