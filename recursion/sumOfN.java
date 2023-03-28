package recursion;

import java.util.*;
public class sumOfN
{
    public static int sumN(int num)
    {
        if (num == 1 || num == 0)
        {
            return 1;
        }
        return num + sumN(num - 1);
    }
   public static void main(String args[])
   {
        System.out.println(sumN(5));
   }
}