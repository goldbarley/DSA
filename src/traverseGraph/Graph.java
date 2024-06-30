package traverseGraph;

import java.util.Random;

public class Graph 
{
    public int[][] adjMatrix;
    public boolean[] visited;
    
    public Graph(int size)
    {
        Random r = new Random();

        adjMatrix = new int[size][size];
        visited = new boolean[size];

        for (int i = 0; i < size; i++)
        {
            visited[i] = false;

            for (int j = 0; j < size; j++)
            {
                if (i == j)
                {
                    adjMatrix[i][j] = 0;
                    continue;
                }

                adjMatrix[i][j] = r.nextInt(2);
            }
        }
    }

    public void printAdjMatrix()
    {
        for (int i = 0, n = adjMatrix.length; i < n; i++)
        {
                System.out.print("| ");

            for (int j = 0; j < n; j++)
            {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.print("|");

            System.out.println();
        }
        System.out.println();
    }
    
}
