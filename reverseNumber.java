
import java.util.*;

public class reverseNumber
{
    public static void main(String args[])
    {
        int num = 662003;
        while (num > 0)
        {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
    }
}