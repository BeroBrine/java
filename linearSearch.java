
import java.util.*;

public class linearSearch
{
    public static void search( int arr[] , int key)
    {
        for ( int i = 0 ; i < arr.length ; i++)
        {
            if ( arr[i] == key)
            {
                System.out.print(i);
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 1 , 5 , 6 , 18 , 8};
        int key = 1;
        search(arr , key);
    }
}