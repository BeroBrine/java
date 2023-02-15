package practice.starPattern;


import java.util.*;

public class chrPattern
{
    public static void main(String args[])
    {
        int asciiChr = 65;
        int n = 4;
        char chr = 'A';
        System.out.println("The char pattern is as follows - ");
        // with ascii
        for ( int rows = 1 ; rows <= n ; rows++ )
        {
            for ( int j = 1 ; j <= rows ; j++)
            {
                System.out.print((char)asciiChr);
                asciiChr++;
            }
            System.out.println();

        }

        // with char 
        for (int rows1 = 1 ; rows1 <= n ; rows1++)
        {
            for (int j = 1 ; j <= (n - rows1) ; j++)
            {
                System.out.print(chr);
                chr++;
            }
            System.out.println();
        }
    }
}