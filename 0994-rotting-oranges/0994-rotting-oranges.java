class Solution {
        public int [][]visit;
        public int r;
        public int c; 
    class pair
    {
        int row;
        int col;
        int t;
        public pair(int row,int col,int t)
        {
            this.row=row;
            this.col=col;
            this.t=t;
        }
    }
    public int maxt=0; 
    public int orangesRotting(int[][] a) {
        r=a.length;
        c=a[0].length;
        visit=new int[r][c];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==2)
                {
                    q.add(new pair(i,j,0));
                    visit[i][j]=1;
                }
            }
        }
        while(!q.isEmpty())
        {
            pair current=q.poll();
            int re=current.row;
            int ce=current.col;
            int te=current.t;
            maxt=Math.max(te,maxt);
            int []dx={+1,0,-1,0};
            int []dy={0,+1,0,-1};
            for(int i=0;i<4;i++)
            {
                int nr=re+dx[i];
                int nc=ce+dy[i];
                if(nr>=0 && nr<r &&nc>=0 && nc<c &&a[nr][nc]==1 &&visit[nr][nc]==0)
                {
                    visit[nr][nc]=1;
                    a[nr][nc]=2;
                    q.add(new pair(nr,nc,te+1));
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                {
                   return -1;
                }
            }
        }
        return maxt;
    }
}