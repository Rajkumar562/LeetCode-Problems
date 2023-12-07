class Solution {
    public int totalMoney(int n) {
        
        int k=n/7;
        int a=28;
        int l=a+(k-1)*7;
        int sum=k*(a+l)/2;
        
        int mon=1+k;int res=0;
        for(int d=0;d<n%7;d++)
            res+=mon+d;
        return sum+res;
    }
}