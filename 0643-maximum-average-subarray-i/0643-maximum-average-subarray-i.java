class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum=0;
        int n=a.length;
        double avg=0.0;
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        avg=(double)sum/k;
        double max=avg;
        for(int i=1;i<=n-k;i++)
        {
            int j=i+k-1;
            sum-=a[i-1];
            sum+=a[j];
            avg=(double)sum/k;
            max=Math.max(avg,max);
        }
        return max;
        
    }
}