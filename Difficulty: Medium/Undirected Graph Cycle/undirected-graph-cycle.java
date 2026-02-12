class pair {
    int x, y;
    pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        boolean[] visited = new boolean[V];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        for (int start = 0; start < V; start++) {
            if (!visited[start]) {
                Stack<pair> st = new Stack<>();
                st.push(new pair(start, -1));

                while (!st.isEmpty()) {
                    pair p = st.pop();
                    int node = p.x, parent = p.y;

                    if (visited[node]) continue;
                    visited[node] = true;

                    for (int nbr : adj.get(node)) {
                        if (visited[nbr] && nbr != parent) {
                            return true;
                        }
                        if (!visited[nbr]) {
                            st.push(new pair(nbr, node));
                        }
                    }
                }
            }
        }
        return false;
    }
}
