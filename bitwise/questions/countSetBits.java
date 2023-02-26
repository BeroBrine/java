package bitwise.questions;


import java.util.*;

public class countSetBits
{
    // public static int count(int num)
    // {
    //     int count = 0;
    //     while ( num < 0)
    //     {
    //         int lastDigit = num % 10;
    //         if ( lastDigit == 1)
    //         {
    //             count++;
    //         }
    //         num = num / 10;
    //     }
    //     return count;
    // }
    public static int count2(int num)
    {
        int count = 0;
        while ( num > 0)
        {
            int cond = num & 1;
            if (cond == 1) count++;
            num = num >> 1;
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.print(count2(10));
    }
}