class Solution {
    public int maxCoins(int[] piles) {
        int ans=0;
        Arrays.sort(piles);
        int left=0,right=piles.length-1;
        while(left<right)
        {
            right--;
            ans+=piles[right--];
            left++;
        }
        return ans;
    }
}