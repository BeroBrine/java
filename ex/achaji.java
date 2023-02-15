
import java.util.*;

public class achaji
{
    public static void printPatt(int totalRows , int totalColumns)
    {
        for ( int row = 1 ; row <= totalRows ; row++)
        {
            for ( int column = 1 ; column <= totalColumns ; column++)
            {
                if ( row == 1 || row == totalRows || column == 1 || column == totalColumns)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows here - ");
        int totalRows = sc.nextInt();

        System.out.print("Enter the columns here - ");
        int totalColumns = sc.nextInt();

        printPatt(totalRows, totalColumns);
        sc.close();



    }
}
