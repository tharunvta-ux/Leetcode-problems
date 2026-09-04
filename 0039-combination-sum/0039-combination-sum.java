class Solution {
    ArrayList<List<Integer>> li=new ArrayList<>();
    ArrayList<Integer>temp =new ArrayList<>();
    int n;

    public List<List<Integer>> combinationSum(int[] candidates, int t) {
        n=candidates.length;
        solve(0,0,t,candidates);
        return li;
    }
    public void solve(int index,int cursum,int t,int []candidates) 
    {
        if(index==n)
        {
            if(cursum==t)
            {
                li.add(new ArrayList<>(temp));          
            }
            return;
        }
        if(cursum>t)
        {
            return;
        }
        temp.add(candidates[index]);
        solve(index,candidates[index]+cursum,t,candidates);
        temp.remove(temp.size()-1);
        solve(index+1,cursum,t,candidates);
return;
    }
}