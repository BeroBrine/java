import java.util.*;

public class OOPS
{
    
    public static void main(String args[])
    {
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        System.out.println(pen1.color);
        pen1.setTip(5);
        System.out.println(pen1.tip);
    }
}


class Pen 
{
    
    String color;
    int tip;

    void setColor(String newColor)
    {
    color = newColor;
    }
    void setTip(int newTip)
    {
    tip = newTip;
    }
}

class student
{
    int age;
    String name;
    int percentage;
    int phy , chem , maths;
    void setPercentage()
    {
        percentage = (phy + chem + maths) / 3;
    }
    
}