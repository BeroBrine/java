package miscs;


import java.util.*;

public class deciToBino
{
    public static int conversion(int num )
    {
        int rem;
        int place = 0;
        int power = 0; 
        while ( num > 0 )
        {
            rem = num % 2;
            place = place + ( rem * (int)Math.pow(10 , power));
            power ++;
            num = num / 2; 

        }
        return place;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number here - ");
        int deciNum = sc.nextInt();

        System.out.print(conversion(deciNum));
        sc.close();

    }
}