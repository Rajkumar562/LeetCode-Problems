class Solution {
    public List<String> summaryRanges(int[] nums) {
        List <String> range=new ArrayList<>();

        if(nums.length==0)
        return range;
        if(nums.length==1)
        {
            range.add(Integer.toString(nums[0]));
            return range;
        }
        int prev=0; int added=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                prev=nums[i];
                added=nums[i];
                continue;
            }
            if(nums[i]-prev==1  && i!=nums.length-1)
            prev=nums[i];
            else if(i==nums.length-1)
            {
                if(nums[i]-prev==1)
                range.add(added+"->"+nums[i]);
                else if(added==prev)
                {
                    range.add(Integer.toString(prev));
                    range.add(Integer.toString(nums[i]));
                }
                else
                {
                    range.add(added+"->"+prev);
                    range.add(Integer.toString(nums[i]));
                }
            }
            else
            {
                if(added==prev)
                range.add(Integer.toString(prev));
                else
                range.add(added+"->"+prev);

                prev=nums[i];
                added=nums[i];
            }
        }
        return range;
    }
}