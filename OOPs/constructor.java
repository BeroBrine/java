
import java.util.*;

public class constructor
{
    public static void main(String args[])
    {
        Student s1 = new Student("bugga");
        System.out.println(s1.getName());
        Student s2 = new Student(56);
        
        
    }
}

class Student
{
    String name;
    private int rollNo;


    // constructor 
    Student(String name)
    {
        // the code inside the constructor is executed at the time of creation of the object 
        this.name = name;  // not name = this.name; 
        System.out.println("Hello " + name);
        
    }
    Student(int rollNo)
    {
        this.rollNo = rollNo;
        System.out.println(rollNo);
    }

    String getName()
    {
        return this.name;
    }

    void setrollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    int getrollNo()
    {
        return this.rollNo;
    }
}