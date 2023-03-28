package recursion;

import java.util.*;

public class sortArr
{
    public static void sort(int arr[] , int i)
    {
        if ( i == arr.length - 1)
        {
            return;
        }
        if (arr[i] > arr[i+1])
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        sort(arr , i+1);
    }

    public static void printArr(int arr[])
    {
        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 5 ,2 ,3 ,4 ,8};
        sort(arr , 0);
        printArr(arr);
    }
}