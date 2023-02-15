
import java.util.*;

public class subArray
{
    public static void main(String args[])
    {
        int arr[] = { 2 , 3 , 4, 5, 6 ,66 ,55};
        int ts = 0;
        for ( int i = 0 ; i < arr.length ; i++)
        {
            int start = i;
            for ( int j = (i) ; j < arr.length ; j++ )
            {
                int sumArr = 0;
                int end = j;
                for ( int k = start ; k <= end ; k++)
                { 
                    sumArr = sumArr + arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("the sum of this subarr is - " + sumArr);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array is - " + ts);
    }
}