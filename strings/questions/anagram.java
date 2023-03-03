package strings.questions;


import java.util.*;

public class anagram
{
    public static boolean ana(String str1 , String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        else{
            char[] str1array = str1.toCharArray();
            char[] str2array = str2.toCharArray();

            // sorting the arrays 
            Arrays.sort(str1array);
            Arrays.sort(str2array);

            // checking if they are equal
            if ( Arrays.equals(str1array , str2array))
            {
                return true;
            } else return false;
        }
    }
    public static void main(String args[])
    {
        String str1 = "ana";
        String str2 = "nasda";
        System.out.println(ana(str1, str2));
    }
}