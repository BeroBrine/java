package miscs;


import java.util.*;

public class BinoToDeci
{
    public static int conversion(int num )
    {
        int lastDigit;
        int sum = 0;
        int power = 0;
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
        int userInput = sc.nextInt();
        System.out.print(conversion(userInput));

        sc.close();
    }
}