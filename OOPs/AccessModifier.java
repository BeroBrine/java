
import java.util.*;

import javax.print.DocFlavor.STRING;

public class AccessModifier
{
    public static void main(String args[])
    {
        BankAccount myAcc = new BankAccount();

        myAcc.userName = "Abhishek";
        // myAcc.password = "chungus bisht"; // throws error because other classses dont have access to the password as it is private 
        myAcc.setPassword("abcde");
        // this changes the password but we cant print out or acccess the variable value due to it being private 
    }
}


class BankAccount 
{
    public String userName; // accessible to everyone
    private String password; // only accessible to the class 
    public void setPassword(String pwd)
    {
        password = pwd;
    }
}