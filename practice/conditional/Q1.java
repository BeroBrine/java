// ava program to get a number from the user and print whether it is positive or negative
import java.util.*;

public class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here = ");
        int userInput = sc.nextInt();

        // checking if it is negative or not 
        if (userInput < 0)
        {
            System.out.print("The number is negative ");

        }
        else
        {
            System.out.print("The number is positive");
        } 
    }
}