
import java.util.*;

public class q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int multpli;
        // multiplication table
        for ( int i = 1 ; i <= 10 ; i++)
        {   
            multpli = userInput * i;
            System.out.printf(" %s * %s = %s \n" , userInput , i , multpli);
        }
    }
}