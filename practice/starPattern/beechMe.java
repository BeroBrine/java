package practice.starPattern;


import java.util.*;

public class beechMe
{
    public static void pattern(int tRows)
    {
        // 1st half loop
        for ( int i = tRows ; i >= 1  ; i--)
        {
            // stars
            for ( int j = 1 ; j<=i; j++ )
            {
                System.out.print("*");
            }
            // spaces
            for ( int j = 0 ; j <= 2*(tRows-i) ; j++)
            {
                System.out.print(" ");
                
            }
            // stars
            for ( int j = 0 ; j <= i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        //2nd half 
        for ( int i = 1 ; i <= tRows  ; i++)
        {
            // stars
            for ( int j = 1 ; j<=i; j++ )
            {
                System.out.print("*");
            }
            // spaces
            for ( int j = 0 ; j <= 2*(tRows-i) ; j++)
            {
                System.out.print(" ");
                
            }
            // stars
            for ( int j = 0 ; j <= i ; j++ )
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

        pattern(rows);
        sc.close();
    }
}
