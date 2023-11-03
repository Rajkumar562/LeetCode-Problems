class Solution {
    public int paintWalls(int[] cost, int[] time) {
        return solve(0,cost.length,cost,time);
    }
    int dp[][] =new int[501][501];
    public int solve(int ind,int walls,int []cost, int []time)
    {
        if(walls<=0)
        return 0;

        if(ind>=cost.length)
        return 1000000000;        

        if(dp[ind][walls]!=0)
        return dp[ind][walls];

        int take=cost[ind]+solve(ind+1,walls-1-time[ind],cost,time);
        int leave=solve(ind+1,walls,cost,time);

        dp[ind][walls]=Math.min(take,leave);
        
        return dp[ind][walls];
    }
}