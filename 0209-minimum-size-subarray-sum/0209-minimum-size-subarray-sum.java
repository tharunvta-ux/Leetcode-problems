class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int sum=0;
        int r=0,l=0;

    int max=Integer.MAX_VALUE;
        while(r<a.length)
        {
            sum+=a[r];

            while(sum>=t)
            {
                max=Math.min(max,r-l+1);
                sum-=a[l];
                l++;
            }
            r++;
        }
    if(max==Integer.MAX_VALUE)
    {
        return 0;
    }
        return max;
    }
}