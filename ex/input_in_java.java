
import java.util.*;

public class input_in_java 
{
    /* to get input in java we use scanner class */
    public static void main(String args[])
    {
        Scanner ya = new Scanner(System.in);
        // String user_input = ya.next(); // doesn store text after space
        // System.out.println(user_input + "acha");
        // String space_input = ya.nextLine();
        // System.out.println(space_input);     prints out the text with space
        int user_int = ya.nextInt();
        System.out.println(user_int);
    }
}
