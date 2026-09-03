class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) ->
            Integer.compare(a[0],b[0])
        );

        int[][] ans = new int[intervals.length][2];

        int count = 0;

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
            if(end >= intervals[i][0])
            {
                end = Math.max(end,intervals[i][1]);
            }
            else
            {
                ans[count][0] = start;
                ans[count][1] = end;
                count++;

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        
        ans[count][0] = start;
        ans[count][1] = end;
        count++;

       
        int[][] result = new int[count][2];

        for(int i=0;i<count;i++)
        {
            result[i][0] = ans[i][0];
            result[i][1] = ans[i][1];
        }

        return result;
    }
}