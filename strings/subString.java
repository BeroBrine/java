package strings;


import java.util.*;

public class subString
{
    public static String sub(String str , int si , int ei)
    {   
        String subString = "";
        for ( int i = si ; i < ei ; i++)
        {
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main(String args[])
    {
       String str = "Abhishek";
       int si = 0;
       int ei = 5; 
       System.out.println(sub(str, si, ei));

       // using the inbuilt function
       System.out.println(str.substring(0 , 5));
    }
}