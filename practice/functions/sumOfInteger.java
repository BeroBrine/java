package practice.functions;


import java.util.*;

public class sumOfInteger
{
    public static long addInteger( long num )
    {
        long lastDigit;
        long sum = 0;
        while ( num > 0)
        {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer here - ");
        long userInput = sc.nextLong();

        System.out.print(addInteger(userInput));
        sc.close();
    }
}