package practice.starPattern;
import java.util.*;
public class hollowRhombus
{
    public static void hollow(int tRows)
    {
        // outer loop 
        for ( int i = 1 ; i <= tRows ; i++ )
        {
            // inner loop for spaces
            for ( int j = (tRows - i) ; j >= 1 ; j-- )
            {
                System.out.print(" ");
            }
            // star k lie loop 
            for ( int j = 1 ; j <= (tRows) ; j++)
            {
                if ( i == 1 || i == (tRows) || j == 1 || j == (tRows))
                {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows here -");
        int rows = sc.nextInt();

        hollow(rows);
    }
}
