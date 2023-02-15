package practice.functions;


import java.util.*;

public class palindrome
{
    public static boolean isPalindrome( int num)
    {
        int originalNumber = num;
        int lastDigit;
        int rev = 0;

        while( num > 0)
        {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;

        }
        if ( rev == originalNumber) 
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here - ");
        int userInput = sc.nextInt();

        System.out.print(isPalindrome(userInput));

        sc.close();
    }
}
