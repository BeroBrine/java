
import java.util.*;

public class primeOrNot
{                  
    public static boolean isPrime(int num)
    {
        if ( num == 0 | num == 1)
        {
            return false;
        }
        if ( num == 2)
        {
            return true;
        }

        // another i loop for checking prime using the property of checking upto number less than or equal to its root 
        for ( int i = 2 ; i * i <= num ; i++)
        {
            if ( num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower range here - ");
        int lowerRange = sc.nextInt();

        System.out.print("Enter the upper range here - ");
        int upperRange = sc.nextInt();

        // sending the values of i from lower range to upper range 
        for ( int i = lowerRange ; i <= upperRange ; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        sc.close();


    }
}
