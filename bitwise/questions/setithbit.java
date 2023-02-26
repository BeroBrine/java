package bitwise.questions;


import java.util.*;

public class setithbit
{
    public static int setith(int n , int i)
    {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String args[])
    {
        System.out.print(setith(4, 1));
    }
}