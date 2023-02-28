import java.util.*;
public class getSet
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();
        p1.setTip(5);
        p1.setColor("red");
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}


class Pen 
{
    private String color;
    private int tip;

    // void setColor(String newColor)
    // {
    //     color = newColor;
    // }

    // void setTip(int newTip)
    // {
    //     tip = newTip; 
    // }
     
    // defining the get functions 
    String getColor()
    {
        return this.color;
    }                              // getters 

    int getTip()
    {
        return this.tip;
    }                   


    void setTip(int tip)
    {
        this.tip = tip;
    }                               // setters 

    void setColor(String color)
    {
        this.color = color;         // this = object name eg p1
    }

}