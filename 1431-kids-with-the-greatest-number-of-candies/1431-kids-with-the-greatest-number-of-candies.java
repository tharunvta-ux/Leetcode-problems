class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        
        int m=0;
        for(int i:c)
        {
            m=Math.max(m,i);
        }
       
        List<Boolean>l=new ArrayList<>();
        for(int i:c)
        {
          
            if(i+e >=m)
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }
        return l;
        
    }
}