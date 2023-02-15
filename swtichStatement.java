import java.util.*;

public class swtichStatement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        switch (userInput)
        {
            case "chungus": System.out.println("fan");
                    break;
            case "burger": System.out.println("Chungus");
                    break;
            default : System.out.println("default");
        }
    }
    
}