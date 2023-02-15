package practice.starPattern;

import java.util.*;

public class zeroOne
{
    public static void patt(int row)
    {
        for ( int i = 1 ; i <= row ; i++)
        {
            for ( int j = 1 ; j <= i ; j++)
            {
                if ( (i + j) % 2 == 0 )
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        patt(7);
    }
}