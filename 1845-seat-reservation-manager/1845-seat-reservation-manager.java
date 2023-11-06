class SeatManager {
    boolean arr[];int ind;
    public SeatManager(int n) {
        arr=new boolean[n];
        ind=0;
    }
    
    public int reserve() {
        arr[ind++]=true;
        int ans=ind;
        while(ind < arr.length && arr[ind])
        ind++;
        return ans;
    }
    
    public void unreserve(int seatNumber) {
        arr[seatNumber-1]=false;
        if(seatNumber-1 < ind)
        ind=seatNumber-1;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */