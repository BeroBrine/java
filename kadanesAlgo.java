
import java.util.*;
import java.util.concurrent.Flow.Subscriber;

public class kadanesAlgo
{
    public static void kadanes(int arr[])
    {
        int ns = Integer.MIN_VALUE;
        boolean cond = true;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for ( int i = 0 ; i < arr.length ; i++)
        {
            if ( arr[i] < 0)
            {
                ns = Math.max( arr[i] , ns);
            }
            else
            {
                cond = false;
                break;
            }
        }

        if (cond)
        {
            System.out.print(ns);
        }
        else
        {
            for ( int i = 0 ; i < arr.length ; i++)
            {
                currSum = currSum + arr[i];
                if ( currSum < 0)
                {
                    currSum = 0;
                }
                maxSum = Math.max( maxSum , currSum );
            }
            System.out.print(maxSum);
        }
    }
    public static void main(String args[])
    {
        int arr[] = { -7 , -2 , -6 , 8 , -3};
        kadanes(arr);
    }
}