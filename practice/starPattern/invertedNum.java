package practice.starPattern;


import java.util.*;

public class invertedNum
{
    public static void invertedPrint(int row)
    {
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 1 ; j <= (row-i) ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows here - ");
        int row = sc.nextInt();

        invertedPrint(row);
        sc.close();

    }
}