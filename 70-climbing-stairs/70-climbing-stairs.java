class Solution {
    public int climbStairs(int n) {
        
        int tb[]=new int [n+1];
        tb[0]=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
                tb[i]=1;
            else
            tb[i]=tb[i-1]+tb[i-2];
        }
        return tb[n];
    }
}