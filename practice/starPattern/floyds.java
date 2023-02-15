package practice.starPattern;


import java.util.*;

public class floyds
{
    public static void printPat(int rows)
    {
        int num = 1;
        for ( int row = 1 ; row <= rows ; row++ )
        {
            for ( int column = 1; column <= row ; column++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        printPat(10);
    }
}
