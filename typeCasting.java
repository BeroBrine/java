package ex;
import java.util.*;
public class typeCasting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // double a = 2.12;
        // float b = (int) a;
        // System.out.println(b);
        // char ch = 'a';
        // int asciiNumber = ch;
        // System.out.println(asciiNumber);
        /* java converts every char byte or short into int while evaluating expressions */
        // but 
        // char ch1 = 'a';
        // char ch2 = 'c';
        // char diff = (ch2 - ch1); // this is a lossy conversion
        // System.out.println(diff); 

        // another example of lossy conversion
        byte bit = 5;
        // bit = bit * 5; // lossu conversion as bit is converted to int before multiplying
        
        // non lossy conversion 
        bit = (byte)(bit * 10);
        System.out.println(bit);
    }
}