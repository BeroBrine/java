package bitwise.questions;


import java.util.*;

public class powerof2
{
    public static boolean check( int n)
    {
        int cond = (n & (n-1));
        if (cond == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here - ");
        int num = sc.nextInt();
        System.out.println(check(num));
    }
}