package miscs;


import java.util.*;

public class charPattern
{
    public static void printPattern(int rows)
    {
        int asciiChr = 65;
        for( int i = 0 ; i <= rows ; i++ )
        {
            for ( int j = 1 ; j <= ( rows - i) ; j++ )
            {
                System.out.print(" ");
            }
            for ( int j = 1 ; j <= i ; j++)
            {
                if (asciiChr == 91)
                {
                    asciiChr = 65;
                }
                System.out.print((char)asciiChr);
                asciiChr++;
            }
            System.out.println();
        }
        
        
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows = ");
        int rows = sc.nextInt();

        printPattern(rows);
    }
}