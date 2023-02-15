package practice.starPattern;
import java.util.*;

public class butterfly
{
    public static void butter(int trows)
    {
        for ( int i = 1 ; i <= trows ; i++)
        {
            // stars
            for ( int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            // spaces
            for ( int j = 1 ; j <= 2*(trows-i); j++)
            {
                System.out.print(" ");

            }
            // star 
            for( int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half loop
        for ( int i = trows ; i>=1 ; i--)
        {
            // stars
            for ( int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            // spaces
            for ( int j = 1 ; j <= 2*(trows-i); j++)
            {
                System.out.print(" ");

            }
            // star 
            for( int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows - ");
        int rows = sc.nextInt();

        butter(rows);
    }
}