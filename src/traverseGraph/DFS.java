package traverseGraph;

import java.util.Random;

public class DFS 
{
    private static final int SIZE_OF_GRAPH = 5;
    public static void main(String[] arGs)
    {
        notes.dfs.printNotes();

        long startTime = System.nanoTime();

        Graph G = new Graph(SIZE_OF_GRAPH);

        System.out.println("Adjacency Matrix:");
        G.printAdjMatrix();

        System.out.print("Order: ");
        dfs(G);

        System.out.println();

        long endTime = System.nanoTime();

        System.out.printf("Time of execution: %.4f seconds", (double) (endTime - startTime) / 1_000_000_000.0);
    }

    public static void dfs(Graph G)
    {
        for (int i = new Random().nextInt(SIZE_OF_GRAPH); i < SIZE_OF_GRAPH; i++)
        {
            if (!G.visited[i])
            {
                dfs(i, G.adjMatrix, G.visited);
            }
        }
    }

    private static void dfs(int src, int[][] matrix, boolean[] visited)
    {
        visited[src] = true;
        System.out.print(src + " ");

        for (int i = 0; i < SIZE_OF_GRAPH; i++)
        {
            if (matrix[src][i] == 1 && !visited[i])
            {
                dfs(i, matrix, visited);
            }
        }
        
        return;
    }
}
