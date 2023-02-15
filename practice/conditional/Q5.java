// java program that takes a year from the user and print whether that year is a leap o rnot 
import java.util.*;

public class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int inputYear = sc.nextInt();

        // conditional to check if the year is leap or not
        if (inputYear % 4 == 0)
        {
            if (inputYear % 100 == 0 & inputYear % 400 == 0)
            {
                System.out.println("The year is a leap year");
            }
            else
            {
                System.out.println("This year is not a leap year");
            }
        }
        else
        {
            System.out.println("The year is not a leap year");
        }
    }
}