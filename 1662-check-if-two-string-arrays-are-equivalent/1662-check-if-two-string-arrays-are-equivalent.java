class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        int i=0,j=0,x=0,y=0;String a,b;
        while(i<word1.length && j<word2.length)
        {
            a=word1[i];
            b=word2[j];
            
            while(x<a.length() && y<b.length())
            {
                char ch = a.charAt(x++);
                char ch2 =b.charAt(y++);
                if(ch !=ch2)
                    return false;
            }
            
            if(x==a.length())
            {
                x=0;
                i++;
            }
            if(y==b.length())
            {
                y=0;
                j++;
            }
        }
        return ((i==word1.length && j==word2.length)?true:false);
    }
}