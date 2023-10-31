//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int ind =-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            continue;
            else
            {
                ind =(ind==-1) ? i:ind;
                ind = findIndex(arr,ind);
                if(ind==-1)
                break;
                swap(arr,i,ind);
            }
        }
    }
    
    int findIndex(int a[],int ind)
    {
        while(ind<a.length && a[ind]==0)
        ind++;
        
        return ind<a.length ? ind:-1;
    }
    
    void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}