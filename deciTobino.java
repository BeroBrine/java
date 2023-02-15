
import java.util.*;

public class deciTobino
{
    public static int decTobi(int num)
    {
        int rem;
        int binary = 0;
        int power = 0;
        while( num > 0)
        {
            rem = num % 2; // stores the remainder of the number 
            binary = binary + (int)( rem * Math.pow(10 , power)); // this prints out the binary by adjusting the firt remainder on 10^0th place and 1st on 10^1th place
            power++; // increases the power 
            num = num / 2; // changes the num for further division by 2 in while loop 
        }
        return binary;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here - ");
        int decimalNum = sc.nextInt();
        
        System.out.print(decTobi(decimalNum));
        sc.close();
    }

}