package strings;


import java.util.*;

public class stringss
{
    public static void strChr(String str)
    {
        for ( int i = 0 ; i < str.length() ; i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[])
    {
        char arr[] = {'a' , 'b' , 'c' , 'd'};
        String str = "abcd";

        String str2 = new String("abcd");

        // finding the lenggth of the string 
        int len = str.length();
        System.out.println(len);

        // charAt method 
        System.out.println(str.charAt(1));

        strChr(str2);
    }
}