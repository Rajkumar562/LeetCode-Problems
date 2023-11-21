class Solution {
    public int countNicePairs(int[] nums) {
        HashMap <Integer,Integer> mp=new HashMap<>();
        int mod=(int)1e9+7;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int rnum=rev(num);
            int dif=num-rnum;

            if(mp.containsKey(dif))
            {
                ans= (ans+mp.get(dif))%mod;
                mp.put(dif,mp.get(dif)+1);
            }
            else
            mp.put(dif,1);
        }
        return ans;
    }

    public int rev(int n)
    {
        int res=0;
        while(n>0)
        {
            res=res*10+n%10;
            n=n/10;
        }
        return res;
    }
}