class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int l=0;int r=nums.length-1;
        
        while(l<r)
        {
            if(nums[l]%2==0)
            {
              l++;
              continue;
            }
            if(nums[r]%2==1)
            {
              r--;
              continue;
            }
            int x=nums[r];
            nums[r]=nums[l];
            nums[l]=x;
        }
        return nums;
    }
}