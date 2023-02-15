package functions;


import java.util.*;

public class swap
{
    public static void swAp(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("through function a = " + a);
        System.out.println("through function b = " + b);
    }
    public static void main(String args[])
    {
        System.out.println("Before swapping");
        int a = 10;
        int b = 14;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // swap 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("through function ");
        swAp(a , b);
    }
}