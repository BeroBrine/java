package strings;


import java.util.*;

public class upperCase
{
    public static String uppercase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for ( int i = 1 ; i < str.length() ; i++)
        {
            if ( str.charAt(i) == ' ' && i < str.length() - 1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else 
            {
                sb.append(str.charAt(i));
            }
        }
        String ans = sb.toString();
        return ans;

    }
    public static void main(String args[])
    {
        String str = "hi, my name is lorum ipsum";

        System.out.print(uppercase(str));

    }
}