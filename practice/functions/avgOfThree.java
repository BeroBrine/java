package practice.functions;


import java.util.*;

public class avgOfThree
{
    public static int avg( int firstNum , int secondNum , int thirdNum)
    {
        return (firstNum + secondNum + thirdNum)/3;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number here - ");
        int firstNum = sc.nextInt();

        System.out.print("Enter the 2st number here - ");
        int secondNum = sc.nextInt();

        System.out.print("Enter the 3rd number here - ");
        int thirdNum = sc.nextInt();

        System.out.println(avg(firstNum, secondNum, thirdNum));
    }
}