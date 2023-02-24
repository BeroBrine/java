package twoDarrays.questions;


import java.util.*;

public class sumOfRow
{
    public static int sum(int matrix[][])
    {
        int sum = 0;
        for ( int j = 0 ; j < matrix[0].length ; j++)
        {
            sum += matrix[1][j];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int matrix[][] ={   {1,4,9},
                            {14,4,3},
                            {2,2,3}};
        System.out.print(sum(matrix));

    }
}