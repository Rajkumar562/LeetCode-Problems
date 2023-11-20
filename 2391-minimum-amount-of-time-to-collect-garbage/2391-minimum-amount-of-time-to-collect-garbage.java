class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int pind=0,gind=0,mind=0,ans=0;
        int sum[]=new int[garbage.length];
        sum[0]=0;

        for(int i=0;i<garbage.length;i++)
        {
            ans+=garbage[i].length();
            
            if(i!=0)
            sum[i]=sum[i-1]+travel[i-1];
            for(int j=0;j<garbage[i].length();j++)
            {
                char ch=garbage[i].charAt(j);
                if(ch == 'M')
                mind=i;
                else if(ch=='P')
                pind=i;
                else
                gind=i;
            }
        }
        
        return ans+sum[mind]+sum[gind]+sum[pind];
    }
}