package recursion;

import java.util.*;

public class increasing
{
    public static void printIncreasing(int num)
    {
        if (num ==  1)
        {
            return;
        }
        printIncreasing(num - 1);
        System.out.println(num);
    }
   public static void main(String args[])
   {
        printIncreasing(10);
   }
}