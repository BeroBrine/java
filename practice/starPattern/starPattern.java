package practice.starPattern;


import java.util.*;

public class starPattern
{
    public static void main(String args[])
    {
        // straight star pattern for 4 rows 
        System.out.println("The pattern is - ");

        for( int rows = 1 ; rows <= 4 ; rows++)
        {
            for (int i = 1 ; i <= rows ; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}