package practice.loops;
import java.util.*;

public class q2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int factorial;
        System.out.println("Enter the number here - ");
        int userInput = sc.nextInt();
        factorial = userInput;
        
        for ( int i = 1; i < userInput; i++)
        {
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}