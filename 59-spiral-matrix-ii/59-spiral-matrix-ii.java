class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int [n][n];

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;

        int element=1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            mat[top][i]=element++;
            top++;

            for(int i=top;i<=bottom;i++)
            mat[i][right]=element++;
            right--;

            for(int i=right;i>=left;i--)
            mat[bottom][i]=element++;
            bottom--;

            for(int i=bottom;i>=top;i--)
            mat[i][left]=element++;
            left++;
        }
        return mat;
    }
}