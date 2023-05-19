class Solution {
    public boolean isBipartite(int[][] graph) {
        int bi[]=new int [graph.length];
        
        Queue <Integer> q=new ArrayDeque<>();
        for(int i=0;i<bi.length;i++)
        {
            if(bi[i] != 0)
                continue;
            
            q.add(i);
            bi[i]=1;
            
            while(!q.isEmpty())
            {
                int cur=q.poll();
                for(int x:graph[cur])
                {
                    if(bi[x] == 0)
                    {
                        bi[x] = -bi[cur];
                        q.add(x);
                    }
                    else if(bi[x]==bi[cur])
                        return false;
                }
            }
        }
        return true;
    }
}