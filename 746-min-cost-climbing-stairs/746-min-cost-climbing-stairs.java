class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        int tb[]=new int[n+1];
        tb[0]=0;
        tb[1]=0;
        for(int i=2;i<n+1;i++)
        {
            tb[i]=Math.min(tb[i-1]+cost[i-1],tb[i-2]+cost[i-2]);
        }
        return tb[n];
    }
}