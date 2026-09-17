class Solution {

    public int[][] visited;

    public int dfs(int x, int y, int[][] g, int r, int c) {

        visited[x][y] = 1;

        int count = 1;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {

            int nrow = x + dx[i];
            int ncol = y + dy[i];

            if (nrow < 0 || ncol < 0 ||
                nrow >= r || ncol >= c ||
                g[nrow][ncol] == 0 ||
                visited[nrow][ncol] == 1) {

                continue;
            }

            count += dfs(nrow, ncol, g, r, c);
        }

        return count;
    }

    public int maxAreaOfIsland(int[][] g) {

        int r = g.length;
        int c = g[0].length;

        visited = new int[r][c];

        int max = 0;

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                if (g[i][j] == 1 && visited[i][j] == 0) {

                    int count = dfs(i, j, g, r, c);

                    max = Math.max(max, count);
                }
            }
        }

        return max;
    }
}