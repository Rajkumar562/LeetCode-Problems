class Solution {
    public long mostPoints(int[][] questions) {
        int n=questions.length;

        long iterate=0;long skip=0;
        long ans[]=new long [n];
        for(int i=n-1;i>=0;i--)
        {
            if(i+1>n-1)
            skip=0;
            else
            skip=ans[i+1];

            if(i+questions[i][1]+1>n-1)
            iterate=0;
            else
            iterate=ans[i+questions[i][1]+1];

            ans[i]=Math.max(questions[i][0]+iterate,skip);
        }
        return ans[0];
    }
}