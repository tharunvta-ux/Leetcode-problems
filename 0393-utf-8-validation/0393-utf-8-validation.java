class Solution {
    public boolean validUtf8(int[] a) {
        int rem=0;
        for(int i=0;i<a.length;i++)
        {
            if(rem>0)
            {
                if((a[i]&0b11000000)!=0b10000000)
                {
                    return false;
                }
                rem--;
              
                
            }
            else
            {
             if((a[i]&0b10000000)==0)
                {
                    rem=0;
                }
                else   if((a[i]&0b11100000)==0b11000000)
                {
                    rem=1;
                }
                  else if((a[i]&0b11110000)==0b11100000)
                {
                    rem=2;
                }
                   else if((a[i]&0b11111000)==0b11110000)
                {
                    rem=3;
                }
                else
                {
                    return false;
                }
            }
        }
        return rem==0;
    }
}