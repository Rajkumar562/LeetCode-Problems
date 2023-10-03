//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int val=0;
        Map <Character, Integer> mp=new HashMap<>(7);
        mp.put('M',1000);
        mp.put('D',500);
        mp.put('C',100);
        mp.put('L',50);
        mp.put('X',10);
        mp.put('V',5);
        mp.put('I',1);
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int val1=mp.get(ch);
            
            if(i==str.length()-1)
            {
                val+=val1;
                break;
            }
            
            char ch2=str.charAt(i+1);
            int val2=mp.get(ch2);
            
            if(val1<val2)
            {
                val+=val2-val1;
                i++;
            }
            else if(val1==val2)
            {
                val+=val1+val2;
                i++;
            }
            else
            val+=val1;
        }
        return val;
    }
}