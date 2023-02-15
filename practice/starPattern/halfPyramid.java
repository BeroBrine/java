package practice.starPattern;


import java.util.*;

public class halfPyramid
{
    public static void main(String args[])
    {
        System.out.println("The half pyramid pattern is as follows - ");
        for ( int rows = 1 ; rows <= 4 ; rows++)
        {
            for (int num = 1 ; num <= rows ; num++ )
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}