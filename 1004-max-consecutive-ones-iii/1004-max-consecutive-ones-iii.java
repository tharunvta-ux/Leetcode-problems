class Solution {
    public int longestOnes(int[] a, int k) {
        int l=0;
        int max=0;
        int z=0;
        for(int r=0;r<a.length;r++)
        {
            if(a[r]==0)
            {
                z++;
            }
          
            
            while(z>k)
            {
                if(a[l]==0)
                {
                    z--;
                }
                l++;
            }
                max=Math.max(max,r-l+1);
        }
        return max;
    }
}