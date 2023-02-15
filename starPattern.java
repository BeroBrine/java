
import java.util.*;

public class starPattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows here - ");
        int rows = sc.nextInt();

        for ( int i = 1 ; i <= rows ; i++)
        {
            for ( int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}