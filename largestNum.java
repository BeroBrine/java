
import java.util.*;

public class largestNum 
{
    public static void main(String args[])
    {
        int arr[] = { 100 , 101 , 3 , 44 , 22 , 8 , -1};
        int largest = arr[0]; // we can also use Integer.MIN_VALUE 
        int smallest = Integer.MAX_VALUE;
        for ( int i = 0 ; i < arr.length ; i++)
        {
            if ( arr[i] > largest)
            {
                largest = arr[i];
            }
            if ( arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}