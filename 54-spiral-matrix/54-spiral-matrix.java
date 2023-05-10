class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int toprow=0;
        int bottomrow=m-1;
        int leftcol=0;
        int rightcol=n-1;

        List l =new ArrayList();
        while(leftcol<=rightcol && toprow<=bottomrow)
        {
            for(int i=leftcol;i<=rightcol;i++)
            l.add(matrix[toprow][i]);
            toprow++;

            for(int i=toprow;i<=bottomrow;i++)
            l.add(matrix[i][rightcol]);
            rightcol--;

            // if used for asymmetrical matrix
            if(toprow<=bottomrow)// matrix 3x4
            {
                for(int i=rightcol;i>=leftcol;i--)
                l.add(matrix[bottomrow][i]);
                bottomrow--;
            }
            
            if(leftcol<=rightcol)// matrix 5x3
            {
                for(int i=bottomrow;i>=toprow;i--)
                l.add(matrix[i][leftcol]);
                leftcol++;
            }
            
        }
        return l;
    }
}