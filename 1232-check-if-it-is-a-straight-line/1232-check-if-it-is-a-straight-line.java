class Solution {
    public boolean checkStraightLine(int[][] value) {
        int base_x = value[0][0];
        int base_y = value[0][1];

        double std=-999999999,tan=-999999999;
        for(int i=1;i<value.length;i++)
        {
            int new_x=value[i][0];
            int new_y=value[i][1];

            try
            {
                tan=(double) (base_y-new_y)/(base_x-new_x);
                 System.out.println(tan);
                if (tan == Double.POSITIVE_INFINITY ||
                    tan == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
            }
            catch(ArithmeticException e)
            {
                tan=Double.MAX_VALUE;
            }
            // System.out.println(tan);
            if(i==1)
            std=tan;
            System.out.println(std);
            if(std!= tan)
            return false;
            else
            tan=std;
        }
        return true;
    }
}