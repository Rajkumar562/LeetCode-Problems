class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);

        int ans=0,diff=0,count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[0]>diff)
            {
                count++;
                diff=nums[i]-nums[0];
            }
            ans+=count;
        }
        return ans;
    }
}