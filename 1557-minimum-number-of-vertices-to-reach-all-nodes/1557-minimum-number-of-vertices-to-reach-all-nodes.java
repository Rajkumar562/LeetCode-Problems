class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        boolean incoming[]=new boolean[n];
        
        for(List<Integer> l:edges)
        {
            incoming[l.get(1)]=true;
        }
        
        List<Integer> vertices=new ArrayList();
        for(int i=0;i<n;i++)
        {
            if(!incoming[i])
                vertices.add(i);
        }
        return vertices;
    }
}