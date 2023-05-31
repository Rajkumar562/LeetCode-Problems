class UndergroundSystem {

Map <Integer, List> checkin;
Map <List<String>,List<Integer>> timeBetween;

    public UndergroundSystem() {
        checkin= new HashMap<>();
        timeBetween = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        List val = new ArrayList<>();
        val.add(stationName);
        val.add(t);
        checkin.put(id,val);
    }
    
    public void checkOut(int id, String stationName, int t) {

        List station = checkin.get(id);
        String checkInStation = (String)station.get(0);
        int checkInTime = (Integer)station.get(1);

        List <String> sta=new ArrayList<String>();
        
        sta.add(checkInStation);
        sta.add(stationName);
        
        if(timeBetween.containsKey(sta))
        {
            List time=timeBetween.get(sta);
            time.add(t-checkInTime);
            timeBetween.put(sta,time);
        }
        else
        {
            List <Integer> time=new ArrayList<Integer>();
            time.add(t-checkInTime);
            timeBetween.put(sta,time);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        List <String> station =new ArrayList<String> ();
        station.add(startStation);
        station.add(endStation);

        if(timeBetween.containsKey(station))
        {
            List time = timeBetween.get(station);
            int total=0;

            for(int i=0;i<time.size();i++)
            total= total + (Integer)time.get(i);

            return (double)total/time.size();
        }
        return 0;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */