class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;

        int[][] arr = new int[n + 1][2];

        for(int i=0;i<n;i++)
        {
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
        }

  
        arr[n][0] = newInterval[0];
        arr[n][1] = newInterval[1];

        Arrays.sort(arr, (a,b) ->
            Integer.compare(a[0],b[0])
        );

        
        int[][] ans = new int[n + 1][2];

        int count = 0;

        int start = arr[0][0];
        int end = arr[0][1];

        for(int i=1;i<arr.length;i++)
        {
            if(end >= arr[i][0])
            {
                end = Math.max(end,arr[i][1]);
            }
            else
            {
                ans[count][0] = start;
                ans[count][1] = end;
                count++;

                start = arr[i][0];
                end = arr[i][1];
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