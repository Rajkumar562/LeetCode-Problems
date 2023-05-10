class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int [n];
        int right[]=new int[n];

        int l=0;
        for(int i=0;i<n;i++)
        {
            l=Math.max(height[i],l);
            left[i]=l;
        }

        int r=0;
        for(int i=n-1;i>=0;i--)
        {
            r=Math.max(height[i],r);
            right[i]=r;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }
}