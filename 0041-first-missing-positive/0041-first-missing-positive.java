class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            nums[i]=0;
        }

        for(int i=0;i<nums.length;i++)
        {
            int x=Math.abs(nums[i]);
            if(x>0 && x<=nums.length)
            {
                if(nums[x-1]==0)
                nums[x-1]=-(nums.length+1);
                else if(nums[x-1]>0)
                nums[x-1]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
            if(nums[i]>-1)
            return i+1;
        }
        return nums.length+1;
    }
}