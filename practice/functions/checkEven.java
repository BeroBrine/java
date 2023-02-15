package practice.functions;


import java.util.*;

public class checkEven
{
    public static boolean isEven(long num)
    {
        if ( num % 2 != 0 ) return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here - ");
        long userInput = sc.nextLong();

        System.out.println(isEven(userInput));
        sc.close();
    }
}