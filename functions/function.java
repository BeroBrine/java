package functions;

import java.util.*;

public class function
{
    public static void printHelloWorld()
    {
        for( int i = 0 ; i < 4 ; i++)
        {
            System.out.println("hello world");
        }
        return;
    }
    public static int sumTwo(int num1 , int num2 )
    {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        printHelloWorld();
        System.out.print("Enter the first number here - ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number here - ");
        int num2 = sc.nextInt();

        System.out.println(sumTwo(num1, num2));
    }
}
