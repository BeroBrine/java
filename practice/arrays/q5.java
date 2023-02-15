package practice.arrays;
import java.util.*;

public class q5
{
    public static void triplet( int arr[])
    {
        int len = arr.length;
        for( int i = 0 ; i < len - 2 ; i++ )
        {
            for ( int j =  i ; j < len - 1 ; j++)
            {
                for ( int k = j ; k < len ; k++)
                {
                    if ( arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.printf("[%s , %s , %s]" , arr[i] , arr[j] , arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = { - 1 , 0 , 1 , 2 , - 1 , 4};
        triplet(arr);
    }
}