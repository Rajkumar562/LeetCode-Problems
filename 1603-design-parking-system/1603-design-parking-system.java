class ParkingSystem {
int b;int m;int s;
    public ParkingSystem(int big, int medium, int small) {
        this.b=big;
        this.m=medium;
        this.s=small;
    }
    
    public boolean addCar(int carType) {
        
        switch(carType)
        {
            case 1:
                if(b>0)
                    {b--; return true;}
                else
                    return false;
            case 2:
                if(m>0)
                    {m--; return true;}
                else
                    return false;
                // break;
            case 3:
                if(s>0)
                    {s--; return true;}
                else
                    return false;
                // break;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */