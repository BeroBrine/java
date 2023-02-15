import java.util.Scanner;
public class chrPattern2
{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("The pattern is as follows - ");
        
        System.out.print("Enter the desired number of rows - ");
        int rows = sc.nextInt();
        int asciiChr = 65;


        for(int i = 1 ; i <= rows ; i++)
        {
            for ( int j = 1 ; j <= i ; j++)
            {
                if (asciiChr == 91)
                {
                    asciiChr = 65;
                }
                System.out.print((char)asciiChr);
                asciiChr++;
            }
            System.out.println();
        }
    }
}