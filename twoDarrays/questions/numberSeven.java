package twoDarrays.questions;


import java.util.*;

import twoDarrays.searchMatrix;

public class numberSeven
{
    public static void numCount(int matrix[][] , int num)
    {
        int count = 0;
        for ( int i = 0 ; i < matrix.length ; i++)
        {
            for ( int j = 0 ; j < matrix[0].length ; j++)
            {
                if( matrix[i][j] == num)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String args[])
    {
        int matrix[][] = {  {4,7,8},
                            {8,8,7}};
        int num = 7;   
        
        numCount(matrix, num);
    }
}