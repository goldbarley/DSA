package traverseGraph;

import dataStructs.Graph;

public class DFS 
{
    public static void dfs(Graph G, int src)
    {
        int nodes = G.adjMatrix.length;
        while (src < nodes)
        {
            if (!G.visited[src])
            {
                dfs(src, G.adjMatrix, G.visited);
            }
            src++;
        }
    }

    private static void dfs(int src, int[][] matrix, boolean[] visited)
    {
        visited[src] = true;
        System.out.print(src + " ");

        for (int i = 0, n = matrix[src].length; i < n; i++)
        {
            if (matrix[src][i] == 1 && !visited[i])
            {
                dfs(i, matrix, visited);
            }
        }
        
        return;
    }
}
