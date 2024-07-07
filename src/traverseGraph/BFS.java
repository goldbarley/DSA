package traverseGraph;

import dataStructs.Graph;
import dataStructs.Queue;

public class BFS {
    public static void bfs(Graph G, int src) {
        bfs(src, G.adjMatrix, G.visited);
    }

    private static void bfs(int src, int[][] matrix, boolean[] visited) {
        int nodes = matrix.length;
        Queue queue = new Queue(nodes);

        queue.enqueue(src);
        visited[src] = true;

        while (queue.length() > 0) {
            src = queue.dequeue();
            System.out.print(src + " ");

            for (int i = 0; i < nodes; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.enqueue(i);
                    visited[i] = true;
                }
            }
        }
    }
}