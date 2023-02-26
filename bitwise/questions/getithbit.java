package bitwise.questions;

import java.util.*;

public class getithbit
{
    public static int ithbit(int n , int i )
    {
        int bit = n & (1 << i);
        if(bit == 0) return 0;
        else return 1;
    }
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(ithbit(n , 2));
        
    }
}