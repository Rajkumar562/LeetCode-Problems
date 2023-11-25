class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];

        int sum=0,cursum=0,endsum=0;
        for(int x:nums)
        sum+=x;

        for(int i=0;i<n;i++)
        {
            int el=nums[i];
            cursum+=el;
            endsum=sum-cursum;
            ans[i]=(el*(i+1)-cursum)+(endsum-el*(n-i-1));
        }
        return ans;
    }
}