package bitwise.questions;


import java.util.*;

public class clearithbit
{
    public static int clearith(int n , int i)
    {
        int bitMask = n & (~(1<<i));
        return n & bitMask;
    }
    public static void main(String args[])
    {
        System.out.print(clearith(5, 2));
    }
}