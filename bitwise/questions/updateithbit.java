package bitwise.questions;


import java.util.*;

public class updateithbit
{
    public static int updateith(int n , int i , int newBit)
    {
        int nBit = n & ~(1<<i);
        int BitMask = newBit << i; // if newBit = 0 --> clear , if newBit = 1 --> set
        return nBit | BitMask;
        
        // simple approach
        //    if (newBit == 0)
        //    {
        //     return n & ~(1<<i);
        //    } 
        //    else if ( newBit == 1)
        //    {
        //     return n | (1<<i);
        //    }
    }
    public static void main(String args[])
    {
        System.out.println(updateith(10, 2, 1));
    }
}