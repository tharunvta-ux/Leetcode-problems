class Solution {
    public int minBitFlips(int s, int g) {
        int n=s^g;
        int c=0;
        while(n!=0)
        {
            n=n&(n-1);
            c++;
        }
        // if(n==1)
        // {
        //     c++;
        // }
        return c;
    }
}