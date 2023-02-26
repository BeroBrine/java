package bitwise.assignment;


import java.util.*;

import functions.swap;

public class Q2
{
    public static void swap(int num1 , int num2)
    {
        System.out.printf("before swap the vars were %s and %s " , num1 , num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.printf("after swap the vars are %s and %s " , num1 , num2);
    }
    public static void main(String args[])
    {
        swap(2, 4);
    }
}