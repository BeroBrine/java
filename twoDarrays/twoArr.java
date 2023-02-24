package twoDarrays;


import java.util.*;

import javax.naming.directory.SearchControls;

public class twoArr
{
    
    public static void largest( int matrix[][])
    {
        int maxVal = Integer.MIN_VALUE;
        for ( int i = 0 ; i < matrix.length ; i++)
        {
            for ( int j = 0 ; j < matrix[0].length ; j++)
            {
                maxVal = Math.max(maxVal , matrix[i][j]);
            }

        }
        System.out.print("the largest value inside the array is = " + maxVal);

    }
    public static void search( int matrix[][] , int key)
    {
        for ( int i = 0 ; i < matrix.length ; i++)
        {
            for ( int j = 0 ; j < matrix[0].length ; j++)
            {
                if ( matrix[i][j] == key)
                {
                    System.out.printf("the number is at (%s,%s)" , i , j);
                }
            }
        }
    }
    public static void inputOutput( int matrix[][])
    {
        Scanner sc = new Scanner(System.in);
        // defining the number of rows(n) and number of columns(n)
        int n = matrix.length;
        int m = matrix[0].length;
        // inputting value inside the array

        for ( int i = 0 ; i < n ; i++) // rows 
        {
            for ( int j = 0 ; j < m ; j++) // columns 
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // getting output from the matrix
        for ( int i = 0 ; i < n ; i++)
        {
            for ( int j = 0 ; j < m ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // creating a 2d array 
        int matrix[][] = new int[3][3];
        
        inputOutput(matrix);
        search(matrix, 4);
        largest(matrix);
    }
}