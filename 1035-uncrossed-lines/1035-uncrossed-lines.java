class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m=nums1.length;int n=nums2.length;
        int mat[][]= new int [m+1][n+1];

        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                mat[i][j]=0;
                else if(nums1[i-1]==nums2[j-1])
                mat[i][j]=1+mat[i-1][j-1];
                else
                mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
            }
        }
        return mat[m][n];
    }
}