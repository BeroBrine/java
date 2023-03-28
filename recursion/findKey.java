package recursion;

import java.util.*;

public class findKey
{
    public static int find(int arr[] , int i)
    {
        int key = 5;
        if (i == arr.length - 1)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }

        return find(arr , i+1);

    }
    public static void main(String args[])
    {
      int arr[] = { 1 , 2 , 3 , 4 , 5 , 6};
      System.out.println(find(arr , 0));  
    }
}