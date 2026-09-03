class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>m=new HashMap<>();
        for(char c : text.toCharArray())
        {
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n')
            {
                m.put(c,m.getOrDefault(c,0)+1);
            }
        }
        if(m.containsKey('l') && m.get('l')>1)
        {
        m.put('l',m.get('l')/2);
        }
        else
        {
            return 0;
        }
     
         if(m.containsKey('o')&& m.get('o')>1)
        {
        m.put('o',m.get('o')/2);
        }
           else
        {
            return 0;
        }
        if(m.size()!=5)
        {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(char ch:m.keySet())
        {
            min=Math.min(min,m.get(ch));
        }
        return min;
    }
}