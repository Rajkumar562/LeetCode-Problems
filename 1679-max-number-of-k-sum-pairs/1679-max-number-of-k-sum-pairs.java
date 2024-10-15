class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        
        Map <Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int n= nums[i];
            int comp = k -n;
            if(map.containsKey(comp)){
                int val = map.get(comp);
                
                count++;
                
                if(val==1)map.remove(comp);
                else map.put(comp,val-1);
            }
            else{
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return count;
    }
}