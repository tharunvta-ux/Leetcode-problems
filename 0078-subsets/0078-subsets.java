class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        int subset=1<<nums.length;
        for(int i=0;i<subset;i++)
        { 
            ArrayList<Integer>a=new ArrayList<>();
            
            for(int j=0;j<nums.length;j++)
            {
                if((i&(1<<j))!=0)
                {
                    a.add(nums[j]);
                }
            }
            l.add(a);
        }
        return l;
    }
}