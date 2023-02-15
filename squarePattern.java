
import java.util.*;

public class squarePattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print - ");
        int rows = sc.nextInt();
        for ( int i = 0 ; i < rows ; i++ )
        {
            System.out.println("****");
        }
    }
}