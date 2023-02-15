package practice;
import java.util.*;
public class Q3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the Pencil - ");
        float costPencil = sc.nextFloat();
        System.out.println("Enter the cost of Pen - ");
        float costPen = sc.nextFloat();
        System.out.println("Enter the cost of eraser - ");
        float costEraser = sc.nextFloat();
        float gst = (costPencil + costPen + costEraser ) * .18f; 
        float totalCost = (float)(costPencil + costPen + costEraser) + gst;
        System.out.println(totalCost);
    }    
}
