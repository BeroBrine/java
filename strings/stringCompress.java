package strings;


import java.util.*;

public class stringCompress
{
    public static void compressString(String str)
    {
        StringBuilder sc = new StringBuilder("");
        for ( int i = 0 ; i < str.length() ; i++)
        {
            Integer count = 1;
            while ( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            sc.append(str.charAt(i));
            if (count > 1)
            {
                sc.append(count.toString());
            }
        }
        System.out.print(sc);
    }
    
    public static void main(String args[])
    {
        String str = "aaabbbccddd";
        compressString(str);
    }
}
