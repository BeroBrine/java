package bitwise.questions;


import java.util.*;

public class clearrange
{
    public static int clear(int n , int j , int i) // j = left most range , i = right most range 
    {
        int a = (~0) <<(j +1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String args[])
    {
        System.out.println(clear(10, 4, 2));
    }
}
