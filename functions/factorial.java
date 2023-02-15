package functions;


import java.util.*;

public class factorial
{
    public static int facto(int num)
    {
        if (num==1)
        {
            return 1;
        }
        else
        {
        return num * facto(num - 1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here - ");
        int userInput = sc.nextInt();

        System.out.println(facto(userInput));
    }
}