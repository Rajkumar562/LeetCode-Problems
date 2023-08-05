class Solution {
    public int minOperations(int[] nums) {
        
        int count=0; int next=nums[0]+1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<next)
            {
                count=count+(next-nums[i]);
                next++;
            }
            else
                next=nums[i]+1;
        }
        return count;
    }
}