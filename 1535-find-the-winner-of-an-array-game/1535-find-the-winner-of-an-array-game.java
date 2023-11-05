class Solution {
    public int getWinner(int[] arr, int k) {
        int ans=arr[0];
        int comp=arr[0];int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(comp>arr[i])
            count++;
            else
            {
                comp=arr[i];
                ans=comp;
                count=1;
            }
            if(count==k)
            break;
        }
        return ans;
    }
}