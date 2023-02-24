package strings.questions;


import java.util.*;

public class output1
{
    public static void output2()
    {
        String str = "ApnaCollege".replace("l" , "");
        System.out.println(str);
    }
    public static void main(String args[])
    {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
        
        output2();
    }
}