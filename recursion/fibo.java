package recursion;

import java.util.*;

public class fibo
{
    public static int printFib(int num)
    {
        // variable declaration    
        int nth;
        if ( num == 1 || num == 2)
        {
            return 1;
        }
        nth = printFib(num - 1) + printFib(num - 2);
        return nth;
    }
   public static void main(String args[])
   {
        System.out.println(printFib(6));
   }
}