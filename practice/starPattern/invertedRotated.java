package practice.starPattern;


import java.util.*;

public class invertedRotated
{
    public static void printPat(int trows)
    {
        for ( int rows = 1 ; rows <= trows ; rows++)
        {
            for( int column = 1 ; column <= ( trows - rows) ; column++)
            {
                System.out.print(" ");
            }
            for(int star = 1 ; star <= rows ; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows here - ");
        int rows = sc.nextInt();

        printPat(rows);
    }
}