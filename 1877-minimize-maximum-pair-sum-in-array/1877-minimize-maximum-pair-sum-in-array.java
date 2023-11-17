class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        int max=0;
        int l=0,r=n-1;
        while(l<r)
        {
            int sum=nums[l++]+nums[r--];
            if(sum>max)
            max=sum;;
        }
        return max;
    }
}