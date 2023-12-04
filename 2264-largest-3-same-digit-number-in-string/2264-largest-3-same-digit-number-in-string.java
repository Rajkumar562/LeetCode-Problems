class Solution {
    public String largestGoodInteger(String num) {
        int i=1;String ans="",newans="";
        while(i<num.length()-1)
        {
            char ch=num.charAt(i);
            char ch2=num.charAt(i-1);
            char ch3=num.charAt(i+1);
            if(ch==ch2 && ch==ch3)
            {
                int x=0;
                while(x++<3)
                newans+=ch;
                
                if(ans=="")
                ans=newans;
                else
                {
                    if(Integer.parseInt(newans)>Integer.parseInt(ans))
                        ans=newans;
                }
                newans="";
            }
            i++;
        }
        return ans;
    }
}