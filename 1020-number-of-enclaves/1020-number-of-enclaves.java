class Solution {
    int r;
    int c;
    int [][]visit;
    public int numEnclaves(int[][] a) {
         r=a.length;
         c=a[0].length;
        visit=new int[r][c];
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 || j==0 || i==r-1 || j==c-1)
                {
                    if(a[i][j]==1 && visit[i][j]==0)
                    {

                    dfs(i,j,a);
                    }
                }
            }
        }
        
        int count=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(visit[i][j]==0 && a[i][j]==1)
                {
                    count++;
                }
            }
        }
        return count;
       
    }
    public void dfs(int row,int col,int [][]a)
    {
        visit[row][col]=1;
        int []dx={+1,0,-1,0};
        int []dy={0,+1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nrow=row+dx[i];
            int ncol=col+dy[i];
            if(nrow>=0 && ncol>=0 && nrow<r && ncol<c && a[nrow][ncol]==1 && visit[nrow][ncol]==0)
            {
                dfs(nrow,ncol,a);
            }
        }
    }
}