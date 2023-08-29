class Solution {
    public int bestClosingTime(String customers) {
        int min=0;int cur=0; int close=0;
        
        for(int i=0;i<customers.length();i++)
        {
            char ch = customers.charAt(i);
            
            if(ch=='Y')
                cur--;
            else
                cur++;
            
            if(cur<min)
            {
                min=cur;
                close=i+1;
            }
        }
        return close;
    }
}