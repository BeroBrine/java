import java.util.Scanner;
public class javaBasics
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number here - ");
        int userInput1 = sc.nextInt();

        System.out.print("Enter the second number here - ");
        int userInput2 = sc.nextInt();

        System.out.print("Enter the third number here - ");
        int userInput3 = sc.nextInt();

        if (userInput1 > userInput2 & userInput1 > userInput3)
        {
            System.out.println("The first number is greatest");
        }
        else if (userInput2 > userInput3 & userInput2 > userInput1)
        {
            System.out.println("The second number is greatest");
        }
        else 
        {
            System.out.println("The third number is greatest");
        }
    }
}