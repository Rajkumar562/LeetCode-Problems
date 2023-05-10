class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;int n=nums.length;
        int z=0;// occurence of zero
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            product*=nums[i];
            else
            z++;
        }
        
        int ans[]=new int [n];
        if(z>1)
        {
            for(int i=0;i<n;i++)
            ans[i]=0;
        }
        else if(z==1)
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                ans[i]=product;
                else
                ans[i]=0;
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}