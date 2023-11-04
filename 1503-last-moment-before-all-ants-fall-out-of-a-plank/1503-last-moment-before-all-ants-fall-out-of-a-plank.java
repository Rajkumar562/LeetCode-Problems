class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        
        int maxleft=-1;int minright=(int)1e9;
        for(int i=0;i<left.length;i++)
        {
            if(left[i]>maxleft)
            maxleft=left[i];
        }

        for(int i=0;i<right.length;i++)
        {
            if(right[i]<minright)
            minright=right[i];
        }
        return Math.max((maxleft-0),(n-minright));
    }
}