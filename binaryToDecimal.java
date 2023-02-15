
import java.net.BindException;
import java.util.*;

public class binaryToDecimal
{
    public static int binoTodeci(int num)
    {
        int power = 0;
        int lastDigit;
        int sum = 0;

        while( num > 0)
        {
            lastDigit = num % 10; //stores the last digit
            sum = sum + (int)( lastDigit * Math.pow(2 , power));
            power++;
            num = num / 10; // removes the last digit 
        }
        // aslo remember that if we define anything inside while loop it has a block scope
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number here - ");
        int num = sc.nextInt();

        System.out.println(binoTodeci(num));
        sc.close();
    }
}