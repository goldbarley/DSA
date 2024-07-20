import java.util.Scanner;

public class BinaryMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int rows;
        do
        {
            System.out.println("Rows: ");
            rows = sc.nextInt();
        } while (rows <= 0);

        int cols;
        do
        {
            System.out.println("Columns: ");
            cols = sc.nextInt();
        } while (cols <= 0);

        sc.close();

        int[][] matrix = new int[rows][cols];
        fill(matrix);

        findLargestSubSq(matrix);
    }

    public static void fill(int[][] matrix)
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                do
                {
                    System.out.print(i + j + ": ");
                    matrix[i][j] = sc.nextInt();
                } while (matrix[i][j] != 0 || matrix[i][j] != 1);
                
            }
        }

        sc.close();
    }

    public static void findLargestSubSq(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int counter = 0;

        for (int i = 0; i < rows; i++) 
        {
            int anotherCounter = 0;
            counter = 0;
            for (int j = 0; j < cols; j++) 
            {
                if (matrix[i][j] == 1)
                {
                    counter++;
                }
            }

            
        }
    }
}