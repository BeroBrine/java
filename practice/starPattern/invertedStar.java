package practice.starPattern;


import java.util.*;
import java.util.concurrent.Flow.Subscriber;

public class invertedStar
{
    public static void main(String args[])
    {
        System.out.println("The inverted star pattern is ");
        for(int rows = 0; rows < 4 ; rows++ )
        {
            for (int star = 0 ; star < ( 4 - rows); star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
