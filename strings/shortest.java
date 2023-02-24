package strings;


import java.util.*;

public class shortest
{   
    public static float shrDistance(String str)
    {   
        int x = 0 , y = 0;
        for ( int i = 0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == 'N') y++;

            else if ( str.charAt(i) == 'S') y--;

            else if ( str.charAt(i) == 'W') x--;

            else if (str.charAt(i) == 'E') x++;
            

        }
        int x2 = (int)Math.pow(x,2);
        int y2 = (int)Math.pow(y,2);
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[])
    {
        String str = "WNEENESENNNS";
        System.out.print(shrDistance(str));
    }
}