class MyHashSet {
    int max=1000001;
    int a[] =new int [max];
    public MyHashSet() {
        
        for(int i=0;i<max;i++)
            a[i]=-1;
    }
    
    public void add(int key) {
        a[key]=key;
    }
    
    public void remove(int key) {
        a[key]=-1;
    }
    
    public boolean contains(int key) {
        if(a[key]!=-1)
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */