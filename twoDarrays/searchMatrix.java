package twoDarrays;


import java.util.*;

public class searchMatrix
{
    public static boolean staircaseSearch(int matrix[][] , int key)
    {
        int row = 0 , col = matrix[0].length - 1;
        while( row < matrix.length && col >= 0)
        {
            if ( matrix[row][col] == key)
            {
                System.out.printf("The key is found at (%s,%s)" , row , col);
                return true;
            }

            else if ( key > matrix[row][col])
            {
                row++;
            }

            else
            {
                col--;
            }
        }
        System.out.println("The key is not found!");
        return false;
    }

    public static boolean bottomCellSearch(int matrix[][] , int key)
    {
        int row = matrix.length - 1 , col = 0;

        while( row >= 0 && col <= matrix[0].length -1)
        {
            if ( matrix[row][col] == key)
            {
                System.out.printf("the key is found at (%s,%s)" , row , col);
                return true;
            }

            else if (key > matrix[row][col] )
            {
                col++;
            }

            else 
            {
                row--;
            }
        }
        System.out.print("the key does not exist");
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][] = {  {10, 20, 30, 40},
                            {15 , 25 , 35 , 45},
                            {27 , 29 , 37 , 48},
                            {32 , 33 , 39 , 50}};
        int key = 33;

        staircaseSearch(matrix, key);
        System.out.println();
        bottomCellSearch(matrix, key);
    }
}
