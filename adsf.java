import java.util.*;

public class adsf
{
    public static void main(String args[])
    {
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(i);
            i += 2;
        }

        teriAmmi wow = new teriAmmi();
        wow.setName("abhishek");
        System.out.println(wow.getName());
    }
}

class teriAmmi
{
    private String Name;

    void setName(String setName)
    {
        Name = setName;
    }

    String getName()
    {
        return this.Name;
    }
    teriAmmi()
    {
        System.out.println("teri maa da fudda oe");
    }

}