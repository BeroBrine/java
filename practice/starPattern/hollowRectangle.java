package practice.starPattern;


import java.util.*;

public class hollowRectangle
{
    public static void hollow( int totalRows , int totalColumns)
    {
        // outer loop for rows 
        for ( int i = 1 ; i <= totalRows ; i++)
        {
            // columns 
            for( int j = 1 ; j <= totalColumns ; j++)
            {
                // conditons for boundary row and columns 
                if ( i == 1 || i == totalRows || j == 1 || j == totalColumns)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows - ");
        int totalRows = sc.nextInt();

        System.out.print("Enter the no of columns - ");
        int totalColumns = sc.nextInt();

        hollow(totalRows, totalColumns);
        sc.close();
    }
}
