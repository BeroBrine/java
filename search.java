
import java.util.*;

public class search
{
    public static int binarySearch(int arr[] , int key)
    {
        int start = 0;
        int end = arr.length - 1;
        // finding mid 
        while ( start <= end)
        {
            int mid = (start + end ) / 2;
            if ( arr[mid] == key)
            {
                return mid;
            }

            if ( arr[mid] > key)
            {
                end = mid - 1;
            }

            if ( arr[mid] < key)
            {
                start = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = { 2 , 5 , 7 , 11 , 14};
        int key = 14;

        System.out.println(" the index of the number is - " + binarySearch(arr, key));
    }
}