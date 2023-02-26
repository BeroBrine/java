package miscs;


import java.util.*;

public class BinoToDeci
{
    public static long conversion(long num )
    {
        long lastDigit;
        long sum = 0;
        long power = 0;
        while ( num > 0)
        {
            lastDigit = num % 10;
            sum = sum + (lastDigit * (int)Math.pow( 2 , power));
            power ++;
            num = num / 10;
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number here - ");
        long userInput = sc.nextLong();
        System.out.print(conversion(userInput));

        sc.close();
    }
}