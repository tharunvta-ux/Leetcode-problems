class Solution {
    public int r;
    public int c;
    public int [][]visit;
    class pair
    {
       public int row;
        public int col;
        public pair(int row,int col)
        {
            this.row=row;
            this.col=col;
        }
    }
    public int[][] floodFill(int[][] a, int sr, int sc, int color) {
        
        r=a.length;
        c=a[0].length;
        visit=new int[r][c];
        int ocolor=a[sr][sc];
        if(ocolor==color)
        {
            return a;
        }

        Queue<pair>q=new LinkedList<>();
        q.add(new pair(sr,sc));
        visit[sr][sc]=1;
        a[sr][sc]=color;
        int []dx={+1,0,-1,0};
        int []dy={0,+1,0,-1};
        while(!q.isEmpty())
        {
            pair current=q.poll();
            int nr=current.row;
            int nc=current.col;
            for(int i=0;i<4;i++)
            {
                int nrow=nr+dx[i];
                int ncol=nc+dy[i];
                if (nrow >= 0 && nrow < r &&
                    ncol >= 0 && ncol < c &&
                    a[nrow][ncol] == ocolor &&
                    visit[nrow][ncol] == 0)
                    {
                        q.add(new pair(nrow,ncol));
                        visit[nrow][ncol]=1;
                        a[nrow][ncol]=color;
                    }
            }
        }
        return a;

    }
}