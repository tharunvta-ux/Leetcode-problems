class Solution {
    int [][]g;;
    int count=0;
    public int totalNQueens(int n) {
        g=new int[n][n];
        solve(0,n);
        return count;
    }
    public void solve(int row,int n)
    {
        if(row==n)
        {
            count++;
            return;
        }
        for(int col=0;col<n;col++)
        {
            int safe=1;
            for(int i=0;i<row;i++)
            {
                if(g[i][col]==1)
                {
                    safe=0;
                    break;
                }
            }
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
            {
                if(g[i][j]==1)
                {
                    safe=0;
                    break;
                }
            }
            for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++)
            {
                if(g[i][j]==1)
                {
                    safe=0;
                    break;
                }
            }
            if(safe==1)
            {
                g[row][col]=1;
                solve(row+1,n);
                g[row][col]=0;
            }
        }
    }
}