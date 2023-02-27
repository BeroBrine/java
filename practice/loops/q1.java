package practice.loops;
import java.util.*;

public class q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int choice;
            int userInput;
            int sumEven = 0;
            int sumOdd = 0;
            
        do 
        {
            System.out.println("Enter the number here - ");
            userInput = sc.nextInt();
            if (userInput % 2 == 0)
            {
                sumEven = sumEven + userInput;
            }
            else
            {
                sumOdd = sumOdd + userInput;
            }
            System.out.println("Do you want to continue? if yes press 1");    
            choice = sc.nextInt();
        }while(choice == 1) ;

        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("The sum of odd numbers is " + sumOdd);


    }
}