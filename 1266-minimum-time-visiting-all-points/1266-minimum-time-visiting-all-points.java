class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int count=0;
        for(int i=1;i<n;i++)
        {
            int x=Math.abs(points[i][0]-points[i-1][0]);
            int y=Math.abs(points[i][1]-points[i-1][1]);
            count+=(Math.max(x,y));
        }
        return count;
    }
}