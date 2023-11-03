class Solution {
    int step; int dp[][]=new int [501][501];
    int div=(int) 1e9 +7;
    public int numWays(int steps, int arrLen) {
        step=steps;
        
        for(int x[]:dp)
        Arrays.fill(x,-1);

        return solve(0,0,arrLen);
    }

    public int solve(int ind,int count,int n)
    {
        if(ind<0 || ind==n)
        return 0;

        if(dp[count][ind]!=-1)
        return dp[count][ind];

        if(count==step)
        {
            if (ind==0)
            return 1;
            else
            return 0;
        }

        int left=solve(ind-1,count+1,n) % div;
        int stay=solve(ind,count+1,n) % div;
        int right=solve(ind+1,count+1,n) % div;

        dp[count][ind]=((left+stay)% div + (right % div))% div;

        return dp[count][ind];
    }
}