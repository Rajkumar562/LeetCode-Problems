//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0;
        long maxSum = Long.MIN_VALUE;
        

        Deque <Integer> dq=new ArrayDeque<Integer>();
        int i;
        for(i=0;i<k;i++)
        {
            int item = Arr.get(i);
            dq.addLast(item);
            sum+=item;
        }
        
        outer:
        for(;i<N;i++)
        {
            if(maxSum < sum)
            {
                maxSum=sum;
            }
            
            int del=dq.removeFirst();
            int add=Arr.get(i);
            dq.addLast(add);
            sum=sum-del+add;
        }
        if(maxSum < sum)
            {
                maxSum=sum;
            }
        return maxSum;
    }
}