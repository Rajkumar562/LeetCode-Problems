//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        char a=word.charAt(0);
        List <int[]> lt = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                char ch=grid[i][j];
                if(ch==a)
                {
                    if(find(grid,word,i,j))
                    {
                        lt.add(new int[]{i,j});
                    }
                }
            }
        }
        
        int ans[][]=new int [lt.size()][2];
        for(int i=0;i<lt.size();i++)
        {
            ans[i]=lt.get(i);
        }
        return ans;
    }
    
    boolean find(char[][] mat,String s,int i,int j)
    {
        int x[]={1,0,-1,0,1,1,-1,-1};
        int y[]={0,1,0,-1,1,-1,1,-1};
        
        for(int ind=0;ind<8;ind++)
        {
            int xi=i;
            int yj=j;
            int k=0;
            while(k<s.length() && xi>=0 && xi<mat.length && yj>=0 && yj<mat[i].length)
            {
                
                if(s.charAt(k)==mat[xi][yj])
                {
                    
                    xi+=x[ind];
                    yj+=y[ind];
                    if(k==s.length()-1)
                    return true;
                    k++;
                }
                else
                break;
            }
        }
        return false;
    }
}