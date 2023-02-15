
import java.util.*;

public class looped
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int userInput;
        userInput = sc.nextInt();

        for( int i = 0 ; i < userInput ; i++)
        {
            System.out.println(i);
            userInput = userInput * i;
        }
    }
}