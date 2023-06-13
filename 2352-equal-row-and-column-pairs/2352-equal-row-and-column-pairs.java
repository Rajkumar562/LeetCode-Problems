class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(grid[i][k]!=grid[k][j])
                    break;
                    else if(k==n-1)
                    count++;
                }
            }
        }
        return count;
    }
}