class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:candyType)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int n=candyType.length;
        int p=n/2;
        if(m.size()>=p)
        {
            return p;
        }
        else
        {
            return m.size();
        }
        
    }
}