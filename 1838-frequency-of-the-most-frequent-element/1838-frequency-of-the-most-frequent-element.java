class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        
        int l=0;
        long sum=0;

        for(int i=0;i<n;i++)
        {
            int item=nums[i];
            sum+=item;

            if((i-l+1)*item-sum>k)
            {
                sum-=nums[l];
                l++;
            }
        }
        return n-l;
    }
}