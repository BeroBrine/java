package strings.questions;


import java.util.*;

public class interning
{
    public static void main(String args[])
    {
        // interning returns the replica of the string refrencing to the same string if it is avaialable inside the heap memory 
        // eg
        String str1 = new String("hello");
        String str2 = "hello";
        String str3 = new String("hello").intern();

        System.out.println(str1 == str2); // different refrence variables
        System.out.println(str2 == str3); // same refrence variable due to intern() function

    }
}
