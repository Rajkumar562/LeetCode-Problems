class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int ans[]=new int[nums.length-k+1];
        int ind=0;

        Deque <Integer> dq=new ArrayDeque<Integer>();
        int i;
        for(i=0;i<k;i++)
        {
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(;i<nums.length;i++)
        {
            ans[ind++]=nums[dq.peek()];

            while(!dq.isEmpty() && dq.peek()<=i-k)
            dq.removeFirst();

            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
            dq.removeLast();

            dq.addLast(i);
        }
        ans[ind]=nums[dq.peek()];
        return ans;
    }
}