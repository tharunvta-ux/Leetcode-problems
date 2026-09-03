class Solution {
    public int totalFruit(int[] a) {
        Map<Integer,Integer> m=new HashMap<>();
        int l=0;
        int max=0;
        for(int r=0;r<a.length;r++)
        {
            m.put(a[r],m.getOrDefault(a[r],0)+1);
           
            while(m.size()>2)
            {
                if(m.get(a[l])>1)
                {
                     m.put(a[l],m.get(a[l])-1);
                }
                else
                {
                    m.remove(a[l]);
                }
                l++;
            }
            
            max=Math.max(max,r-l+1);

        }
        return max;
    }
}