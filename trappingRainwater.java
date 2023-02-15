
import java.util.*;

public class trappingRainwater
{
    public static int trappedWater( int height[])
    {
        int n = height.length;
        // calculating the maximum left boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for ( int i = 1 ; i < n ; i++)
        {
            // comparing the height with previous max height inside of leftMax array
            leftMax[i] = Math.max(leftMax[i-1] , height[i]);
        }
        // calculating the maximun right boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for ( int i = n - 2 ; i >= 0 ; i--)
        {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);  // i + 1 is the previous element ie most height from the right 
        }

        // comparing 
        int rainWater = 0 , waterLevel = 0;
        for ( int i = 0 ; i < n ; i++)
        {
            waterLevel = Math.min(rightMax[i] , leftMax[i]);
            // trapped rainwater = (waterLevel - height of that block) * width
            rainWater += waterLevel - height[i];
        }
        return rainWater;
    }
    public static void main(String args[])
    {
        int height[] = { 4 , 2 , 0 , 6 , 3 , 2 , 5};
        System.out.print(trappedWater(height));
    }
}
