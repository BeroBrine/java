
import java.util.*;

import javax.swing.text.html.StyleSheet;

public class inheritance
{
    public static void main(String args[])
    {
        Fish tuna = new Fish();
        tuna.eat();

        Dog d1 = new Dog();
        d1.legs = 2;
        System.out.println(d1.legs);

        d1.breed ="cc";
        System.out.println(d1.breed);
    }
}

class Animals
{
    String color;

    void eat()
    {
        System.out.println("eats");
    }

    void shits()
    {
        System.out.println("shits");
    }
}

//! child class 
class Fish extends Animals 
{
    int fins;

    void fishC()
    {
        System.out.println("asdf");
    }
}

class Mammals extends Animals
{
    int legs;

    void legs()
    {
        System.out.println("tung");
    }
}

class Dog extends Mammals
{
    String breed;
}