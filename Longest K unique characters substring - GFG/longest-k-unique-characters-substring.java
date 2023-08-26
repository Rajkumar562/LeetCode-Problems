//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap <Character,Integer> mp=new HashMap<>();
        int left=0;int len=0;int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(mp.containsKey(ch))
            mp.put(ch,mp.get(ch)+1);
            else
            {
                mp.put(ch,1);
                len=mp.size();
            }
            if(len==k+1)
            {
                if(count<(i-left))
                count=i-left;
                
                while(len!=k)
                {
                    char c1=s.charAt(left++);
                    int val=mp.get(c1);
                    
                    if(val==1)
                    {
                        mp.remove(c1);
                        len--;
                    }
                    else
                    {
                        mp.put(c1,val-1);
                    }
                }
            }
            if(len==k && i==s.length()-1 && count<i-left+1)
            count=i-left+1;
        }
        if(count==0)
        return -1;
        
        return count;
    }
}