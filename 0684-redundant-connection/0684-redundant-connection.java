class Solution {

    class pair {
        int val;
        int parent;

        pair(int val, int parent) {
            this.val = val;
            this.parent = parent;
        }
    }

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            boolean[] visit = new boolean[n + 1];

            if (hasPath(u, v, adj, visit)) {
                return edge;
            }

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return new int[0];
    }

    public boolean hasPath(int src, int target,
                           List<List<Integer>> adj,
                           boolean[] visit) {

        Queue<pair> q = new LinkedList<>();

        q.add(new pair(src, -1));
        visit[src] = true;

        while (!q.isEmpty()) {

            pair current = q.poll();

            int node = current.val;
            int parent = current.parent;

            if (node == target) {
                return true;
            }

            for (int adjacentNode : adj.get(node)) {

                if (!visit[adjacentNode]) {

                    visit[adjacentNode] = true;

                    q.add(new pair(adjacentNode, node));
                }
            }
        }

        return false;
    }
}