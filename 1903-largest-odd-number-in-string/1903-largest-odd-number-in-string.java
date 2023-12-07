class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>-1)
        {
            char ch=num.charAt(i);
            int n=(int)ch-48;
            
            if((n&1)==1)
                return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}