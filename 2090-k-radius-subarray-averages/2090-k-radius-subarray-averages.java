class Solution {
    public int[] getAverages(int[] nums, int k) {
        
        int n = nums.length;
        int ans[] = new int [n];
        for(int i=0;i<n;i++)
        {
            if(i<k || n-i<=k)
            ans[i]=-1;
        }
        Deque <Integer> dq=new ArrayDeque<>();
        long sum=0;
        int number=2*k+1;
        int lastind=number-1;
        for(int i=0;i<number-1 && i<n;i++)
        {
            sum+=nums[i];
            dq.add(nums[i]);
        }
        for(int i=k;i<n-k;i++)
        {
            dq.add(nums[lastind]);
            sum+=nums[lastind++];
            ans[i]=(int)(sum/(long)number);
            int rem=dq.poll();
            sum-=rem;
        }
        return ans;
    }
}