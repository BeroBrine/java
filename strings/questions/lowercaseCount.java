package strings.questions;


import java.util.*;

public class lowercaseCount
{
    public static int LowerCount (String str)
    {
        int n = str.length();
        int count = 0;
        StringBuilder sb = new StringBuilder("");

        for ( int i = 0 ; i < n ; i++)
        {
            if (Character.isLowerCase(str.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.print(LowerCount("ssssss"));
    }
}