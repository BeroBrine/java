package strings;


import java.util.*;

public class largest
{
    
    public static void main(String args[])
    {
        String arr[] = {"apple" , "mango" , "banana"};

        String largest = arr[0];

        for ( int i = 0 ; i < arr.length ; i++)
        {
            if ( largest.compareTo(arr[i]) < 0 )
            {
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
}