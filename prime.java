
import java.util.*;

public class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here - ");
        int userInput = sc.nextInt();
        boolean flag = false;
        for( int i = 2 ; i < userInput ; i++)
        {
            if (userInput % i == 0)
            {
                flag = true;
                break;
            }

        }
        if (flag)
        {
            System.out.println("The number entered is not a prime number");

        }
        else
        {
            System.out.println("The number entered is a prime number");
        }

    }
}