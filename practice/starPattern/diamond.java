package practice.starPattern;
import java.util.*;
public class diamond
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows here -");
        int rows = sc.nextInt();

        // outer loop 
        for ( int i = 1 ; i <= rows ; i++)
        {
            // inner loop for spaces
            for ( int j = 1 ; j<= (rows-i) ; j++)
            {
                System.out.print(" ");
            }
            // inner loop for stars 
            for ( int j = 1 ; j <= (2*(i) - 1) ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // inner loop 
        for ( int i = rows ; i >= 1 ; i--)
        {
            // inner loop for spaces
            for ( int j = 1 ; j<= (rows-i) ; j++)
            {
                System.out.print(" ");
            }
            // inner loop for stars 
            for ( int j = 1 ; j <= (2*(i) - 1) ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
