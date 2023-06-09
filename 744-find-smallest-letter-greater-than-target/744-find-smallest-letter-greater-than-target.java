class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int t=(int)target;

        if((int)letters[letters.length-1]<t)
        return letters[0];
        for(char c:letters)
        {
            if((int)c >t)
            return c;
        }
        return letters[0];
    }
}