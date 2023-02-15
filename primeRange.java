
import java.util.*;

import javax.xml.catalog.CatalogFeatures.Feature;

public class primeRange
{
    
    public static boolean checkPrime(int num)
    {
        if ( num == 0 | num == 1 )
        {
            return false;
        }
        
        if ( num == 2 )
        {
            return true;
        }


        for ( int i = 2 ; i <= Math.sqrt(num) ; i++)
        {
            if ( num % i == 0 )
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

        for ( int i = lowerRange ; i <= upperRange ; i++)
        {
            if (checkPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}