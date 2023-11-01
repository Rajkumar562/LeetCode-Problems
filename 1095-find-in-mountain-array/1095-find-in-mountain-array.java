/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        
        int len=arr.length();
        int peak= findPeak(arr,0,len-1);

        int left = binleft(arr,0,peak,target);
        if(left!=-1)
        return left;
        int right = binright(arr,peak+1,len-1,target);
        return (right!=-1)?right:-1;
    }

    public int binleft(MountainArray arr,int l,int r, int t)
    {
        while(l<=r)
        {
            int ind=(l+r)/2;
            int mid=arr.get(ind);

            if(mid==t)
            return ind;
            else if(mid<t)
            l=ind+1;
            else
            r=ind-1;
        }
        return -1;
    }

    public int binright(MountainArray a,int l,int r,int t)
    {
        while(l<=r)
        {
            int ind=(l+r)/2;
            int mid=a.get(ind);

            if(mid==t)
            return ind;
            else if(mid<t)
            r=ind-1;
            else
            l=ind+1;
        }
        return -1;
    }

    public int findPeak(MountainArray arr,int l,int r)
    {
        while(l<r)
        {
            int ind=(l+r)/2;
            int mid=arr.get(ind);
            int nextmid=arr.get(ind+1);
            if(mid<nextmid)
            l=ind+1;
            else if(mid>nextmid)
            r=ind;
        }
        return l;
    }
}