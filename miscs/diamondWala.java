package miscs;


import java.util.*;

public class diamondWala
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here - ");
        int rows = sc.nextInt();

        for ( int i = 1 ; i <= rows ; i++)
        {
            for ( int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }

            for ( int j = 1 ; j <= 2*(rows - i) ; j++)
            {
                System.out.print(" ");
            }
            for ( int )
        }
    }
}