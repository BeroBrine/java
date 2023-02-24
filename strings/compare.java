package strings;


import java.util.*;

public class compare
{
    public static void main(String args[])
    {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if ( s1 == s2 )
        {
            System.out.println("The strings are equal");
        }
        else System.out.println("the strings are not equal ");

        if ( s1 == s3)
        {
            System.out.println("the strings are equal");

        }
        else System.out.println("the strings are not equal");

        // the difference is that s2 is pointing towards s1 because new keyword is not used 
        // new keyword makes a whole new object inside the memory which is not equal to that of previous one

        // to rectify this s1.equals(s2) is used 
        if ( s1.equals(s3))
        {
            System.out.print("ratti patte");
        }
    }
}
