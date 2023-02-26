package bitwise.questions;


import java.util.*;

public class oddeve
{
    public static void oddOeven(int n )
    {
        int bitMask = 1;
        int cond = n & bitMask;
        if ( cond == 1)
        {
            System.out.print("the number is odd by bitwise method");
        }
        else 
        {
            System.out.print("the number is even by bitwise method ");
        }

        
    }
    public static void main(String args[])
    {
        oddOeven(16);
    }
}