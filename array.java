import java.util.*;

public class array
{
    public static void update( int arr[])
    {
        for ( int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1 , 2 , 4 , 8 , 9};

        for ( int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " \n");
        }

        update(arr);
        for ( int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}