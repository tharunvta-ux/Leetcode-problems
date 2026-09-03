class Solution {
    public int numSubarrayProductLessThanK(int[] a, int t) {
      
        int sum=1;
        int r=0,l=0;
        int count=0;
   if(t==1)
   {
    return 0;
   }
        while(r<a.length)
        {
            sum*=a[r];

            while(sum>=t)
            {
                sum/=a[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
 
        return count;
    }
}
 