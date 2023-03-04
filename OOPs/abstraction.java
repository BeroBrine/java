
import java.util.*;

public class abstraction
{
    public static void main(String args[])
    {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);    //! before subclass defining the output was brown
    }
}


abstract class Animals
{
    String color;       //! by default the color is brown for every subclass that is made
                        //! until we change the color inside the subclass.
    Animals()
    {
        color = "brown";
    }
    void eat()
    {
        System.out.println("eats");
    }

    abstract void walk();
    
}
// ! now horse inherits the walk function. so we have to implement it in the subclass
class Horse extends Animals
{
    void changeColor()
    {
        color = "dark";
    }
    void walk()
    {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animals
{
    void walk()
    {
        System.out.println("walks on two legs");
    }
}