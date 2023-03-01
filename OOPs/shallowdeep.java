
import java.util.*;

public class shallowdeep {
    public static void main(String args[]) {

    }
}

class Student {
    private String name;
    private int rollNo;
    int marks[];
    // ! SHALLOW COPY
    // Student(Student s1) {
    //     int marks[] = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo; // ! in s1.rollNo this = the object name that want to copy
        //  this.marks = s1.marks;
    // }

    //! DEEP COPY  changes in the s1 object do not reflect in the s2 object
    //  TODO apply a for loop 
    Student(Student s1)
    {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;

        for ( int i = 0 ; i < marks.length ; i++)
        {
            this.marks[i] = s1.marks[i];
        }
    }
}
