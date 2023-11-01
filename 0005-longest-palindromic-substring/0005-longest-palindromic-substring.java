class Solution {
    int a[][]=new int[1001][1001];

    public String longestPalindrome(String s) {
        for(int x[]:a)
        Arrays.fill(x,-1);

        int sp=-1,max=-1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalin(s,i,j) && j-i+1>max)
                {
                    max=j-i+1;
                    sp=i;
                }
            }
        }
        return s.substring(sp,max+sp);
    }
    public boolean isPalin(String s,int i,int j)
    {
        if(i>=j)
        return true;

        if(a[i][j]==1)
        return true;
        else if(a[i][j]==0)
        return false;

        if(s.charAt(i)==s.charAt(j))
        {
            if(isPalin(s,i+1,j-1))
            a[i][j]=1;
            else
            a[i][j]=0;
        }
        return (a[i][j]==1)?true:false;
    }
}