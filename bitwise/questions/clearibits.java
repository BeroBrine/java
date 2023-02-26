package bitwise.questions;
import java.util.*;

public class clearibits
{
    public static int cleari(int n , int i)
    {
        int bitMask = (~0)<<1;
        return n & bitMask;
    }
    public static void main(String args[])
    {
        System.out.print(cleari(5, 2));
    }
}