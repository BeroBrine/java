
import java.util.*;

public class interfaces
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Bear b = new Bear();
        b.eatPlants();
        b.eatMeat();
        
        sc.close();
    }
}
// TODO implementation of interfaces 
interface ChessPlayer
{
    void moves();
}

class Queen implements ChessPlayer
{
    public void moves()
    {
        System.out.println("up , down , left , right , diagonal");
    }

}
class Rook implements ChessPlayer
{
    public void moves()
    {
        System.out.println("up , down , left , right");
    }
}
//! ends 

// TODO multiple inheritance

interface Herbivore
{
    void eatPlants();
}

interface Carnivore
{
    void eatMeat();
}

class Bear implements Herbivore,Carnivore
{
    public void eatPlants()
    {
        System.out.println("Bear eats plants");
    }
    public void eatMeat()
    {
        System.out.println("Bear also eats meat :)");
    }
}

// ! ends