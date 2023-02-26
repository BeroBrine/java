package bitwise.assignment;


import java.util.*;

public class Q1
{
    public static int power(int num)
    {
        int ans = 1;
        int pow = num;
        while ( num > 0)
        {
            if ((pow & 1) != 0)
            {
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println(power(3));
    }
}