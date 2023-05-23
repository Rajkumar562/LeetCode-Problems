import  java.util.*;
class KthLargest {
PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        
        if(nums.length<k)
        {
            for(int i=0;i<nums.length;i++)
            pq.add(nums[i]);
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i<k)
                pq.add(nums[i]);
                else if(pq.peek()<=nums[i])
                {
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
            
        }
        
    }
    
    public int add(int val) {
        if(pq.size()!=k)
            pq.add(val);
        else if(pq.peek()<=val)
        {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */