package practice.starPattern;


import java.util.*;

public class solidRhombus
{
    public static void pat(int trows)
    {
        // outer loop
        for ( int i = 1 ; i <= trows ; i++)
        {
            // spaces k lie
            for ( int j = (trows - i) ; j>=1 ; j--)
            {
                System.out.print(" ");
            }
            // stars k lie
            for( int j = 1 ; j <= trows ; j++)
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

        pat(rows);
        sc.close();
    }
}