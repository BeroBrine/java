package bitwise.assignment;


import java.util.*;

public class Q3
{
    public static void main(String args[])
    {
        for ( char i = 'a' ; i <= 'z' ; i++)
        {
            System.out.print((char)(i ^ ' '));
        }
    }
}