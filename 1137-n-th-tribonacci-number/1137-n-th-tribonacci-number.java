class Solution {
    public int tribonacci(int n) {
        
        if(n==0 || n==1)
            return n;
        if(n==2)
            return 1;
        int mem[]=new int [n+1];
        
        mem[0]=0;
        mem[1]=1;
        mem[2]=1;
        
        return (tri(n,mem));
    }
    public int tri(int n,int mem[])
    {
        if(n<=0)
            return 0;
        
        if(mem[n]!=0)
            return mem[n];
        mem[n]=tri(n-1,mem)+tri(n-2,mem)+tri(n-3,mem);
        
        return mem[n];
    }
}