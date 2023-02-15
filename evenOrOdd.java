import java.util.*;

public class evenOrOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here - ");
        int userInput = sc.nextInt();

        if (userInput % 2 == 0)
        {
            System.out.println("The number is even ");
        }
        else 
        {
            System.out.println("The number is odd ");
        }
    }
    


}