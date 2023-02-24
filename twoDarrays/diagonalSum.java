package twoDarrays;

import java.util.*;

public class diagonalSum {
    public static void diaSum(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        int leftSum = 0;
        int rightSum = 0;

        // left
        for (int i = 0; i <= endRow; i++) {
            for (int j = 0; j <= endCol; j++) {
                if (i == j) {
                    leftSum += matrix[i][j];
                }
            }
        }
        System.out.println("from the left side the sum is " + leftSum);
        
        // right 
        for ( int i = endRow; i>=startRow ; i-- )
        {
            for ( int j = endCol ; j >= startCol ; j--)
            {
                if ( i == j )
                {
                    rightSum += matrix[i][j];
                }
            }
        }
        System.out.print("from the right side the sum is " + rightSum);
    }
    public static int optimised(int matrix[][])
    {
        int sum = 0;
        for ( int i = 0 ; i < matrix.length ; i++)
        {
            // primary diagonal
            // if i == j to j ki jgh i hi rkhde 
            sum += matrix[i][i];
            // secondary diagonal
            // if i + j = matrxi.length - 1 to j = matrix.length - i - i
            // beech wala element overlap na kre islie i != j krna h aur j ki value put krdeni hai 
            if ( i != matrix.length - 1 - i)
            {
                sum+= matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                          { 5, 6, 7, 8 },
                         { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };

        diaSum(matrix);
        System.out.println();
        System.out.print(optimised(matrix));
    }
}