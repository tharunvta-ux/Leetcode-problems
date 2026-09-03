class Solution {
    public int findMinArrowShots(int[][] a) {
        int arrow=1;
        Arrays.sort(a, (ai, b) ->
            Integer.compare(ai[1], b[1])
        );
        int end=a[0][1];
        for(int i=1;i<a.length;i++)
        {
            if(end>=a[i][0])
            {
                continue;
            }
            else
            {
                arrow++;
                end=a[i][1];
            }
        }
        return arrow;
        
    }
}