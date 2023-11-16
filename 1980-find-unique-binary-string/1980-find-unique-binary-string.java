class Solution {
    int n;
    HashSet <String> s=new HashSet<>();
    public String findDifferentBinaryString(String[] nums) {
        n=nums.length;
        
        for(int i=0;i<n;i++)
        s.add(nums[i]);

        return find("");
    }
    public String find(String ans)
    {
        if(ans.length()==n)
        {
            if(!s.contains(ans))
            return ans;
            return "";
        }
        String a=find(ans+"0");
        if(a.length()>0)
        return a;
        
        return find(ans+"1");
    }
}