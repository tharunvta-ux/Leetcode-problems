class Solution {
    public int r;
    public int c;
    public int [][]visit;
    public int ocolor;
    // class pair
    // {
    //    public int row;
    //     public int col;
    //     public pair(int row,int col)
    //     {
    //         this.row=row;
    //         this.col=col;
    //     }
    // }
    public int[][] floodFill(int[][] a, int sr, int sc, int color) {
        
        r=a.length;
        c=a[0].length;
        visit=new int[r][c];
         ocolor=a[sr][sc];
        if(ocolor==color)
        {
            return a;
        }
        dfs(sr,sc,color,a);
 return a;
    }
        // Queue<pair>q=new LinkedList<>();

        // q.add(new pair(sr,sc));
        public void dfs(int sr,int sc,int color,int [][]a)
        {
        visit[sr][sc]=1;
        a[sr][sc]=color;
        int []dx={+1,0,-1,0};
        int []dy={0,+1,0,-1};
        
            for(int i=0;i<4;i++)
            {
                int nrow=sr+dx[i];
                int ncol=sc+dy[i];
                if (nrow >= 0 && nrow < r &&
                    ncol >= 0 && ncol < c &&
                    a[nrow][ncol] == ocolor &&
                    visit[nrow][ncol] == 0)
                    {
                    
                        a[nrow][ncol]=color;
                        dfs(nrow,ncol,color,a);
                    }
            }
        
        }

}