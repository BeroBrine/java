import java.util.*;
public class maxSubArray
{
    public static void main(String args[])
    {
        int arr[] = { 1 , 3 , -5 , -34 , 3 , 6 , 7 , 88};
        int maxSum = Integer.MIN_VALUE;

        for ( int i = 0 ; i < arr.length ; i++)
        {
            int start = i ;
            for ( int j = i ; j < arr.length ; j++)
            {
                int end = j;
                int currSum = 0;
                for (int k = start ; k <= end ; k++)
                {
                    currSum = currSum + arr[k];
                }
                System.out.print(currSum + " ");
                if ( maxSum < currSum  )
                {
                    maxSum = currSum;
                }

            }
        }
        System.out.print("the max sum is - " + maxSum);
    }
}