package twoDarrays.questions;


import java.util.*;

public class transpose
{
    public static void matrixTranspose(int matrix[][])
    {
        int row = matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];

        for ( int i = 0 ; i < row; i++)
        {
            for ( int j = 0 ; j < col ; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);

    }
    public static void printMatrix(int matrix[][])
    {
        for ( int i = 0 ; i < matrix.length ; i++)
        {
            for ( int j = 0 ; j < matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int matrix[][] = {  {1,2,3},
                            {4,5,6}};
        matrixTranspose(matrix);
    }
}
