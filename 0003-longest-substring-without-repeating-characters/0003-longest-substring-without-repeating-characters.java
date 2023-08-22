class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> ans= new HashSet<>();

        int left=0;int right=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ans.isEmpty() || !ans.contains(ch))
            {
                ans.add(ch);
                right++;
                
            }
            else if(ans.contains(ch))
            {
                while(s.charAt(left)!=ch)
                {
                    ans.remove(s.charAt(left++));
                }
                left++;
                right++;
            }
            if(count<ans.size())
            count=ans.size();
        }
        return count;
    }
}