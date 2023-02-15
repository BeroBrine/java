package sorting;


import java.util.*;

public class bubbleSort
{
    public static void bubble(int arr[])
    {
        int len = arr.length;

        for ( int i = 0 ; i < len - 1 ; i++)
        {
            int swaps = 0;
            for ( int j = 0 ; j < len - 1 - i; j++) 
            {
                if ( arr[j] > arr[j+1]) // for ascending sort > for descending sort use < 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    swaps++;
                }
                
            }
            if (swaps == 0)
            {
                break;
            }
        }
    }

    public static void printArr( int arr[])
    {
        for ( int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        bubble(arr);
        printArr(arr);
    }
}