package strings;


import java.util.*;

public class stringbuilder
{
    public static void main(String args[])
    {
        String str = "";

        for ( char chr = 'a' ; chr <= 'z' ; chr++)
        {
            str += chr;
        }
        // this is very inefficient because the string gets copied over into the heap memory
        // so the time complexity is the number of times the loop runs * square of length of the string in the previous iteration = n^2

        // to prevent this we use string builder 
        StringBuilder sb = new StringBuilder("");
        // we use append in this 
        for ( char chr = 'a' ; chr <= 'z' ; chr++)
        {
            // to add in we use .append fn 
            // keep in mind we use append for StringBuilder not string 
            // we can convert StringBuilder to String by using sb.toString();
            // .toString returns values 
            sb.append(chr);
        }

        System.out.println(sb);
        String str1 = sb.toString();
        System.out.println();
        System.out.println(str1.getClass());


    }
}