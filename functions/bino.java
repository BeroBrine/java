package functions;


import java.util.*;

public class bino
{
    public static int facto(int num)
    {
        int fact = 1;
        for(int i = 1 ; i <= num ; i++)
        {
            fact = fact * i; 
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n - ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r - ");
        int r = sc.nextInt();

        System.out.print("binomial coeffecient of 4 is - ");
        int bino =(facto(n))/(facto(r)*(facto(n-r)));
        System.out.println(bino);
    }
}
