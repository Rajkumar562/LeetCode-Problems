class Solution {
    public List<String> buildArray(int[] target, int n) {
        int stream =1;
        List <String> ans=new ArrayList<>();

        for(int i=0;i<target.length;i++)
        {
            if(target[i]==stream)
            {
                ans.add("Push");
                stream++;
            }
            else
            {
                int val=target[i]-stream;
                for(int k=0;k<val;k++)
                ans.add("Push");

                for(int k=0;k<val;k++)
                {
                    ans.add("Pop");
                    stream++;
                }
                i--;
            }
        }
        return ans;
    }
}