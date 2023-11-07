class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        double time[]=new double[n];

        for(int i=0;i<n;i++)
        time[i]=(double)dist[i]/(double)speed[i];

        int count=0;
        Arrays.sort(time);

        int load=0;
        for(int i=0;i<n;i++)
        {
            if(load<time[i])
            {
                count++;
                load++;
            }
            else
            break;
        }
        return count;
    }
}