import java.util.Random;
/**
 * Write a description of class Capitan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capitan extends JugadorDeCampo
{
    // instance variables - replace the example below with your own
    private int liderazgo;

    /**
     * Constructor for objects of class Capitan
     */
    public Capitan(int dorsal)
    {
        super(dorsal);        
        Random random = new Random();
        liderazgo = random.nextInt(6);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getLiderazgo()
    {
        // put your code here
        return liderazgo;
    }
    
     public int valoracion()
    {
        return super.valoracion()+liderazgo;
    }
    
    public String toString()
    {
        return super.toString()+"\t Lierazgo: "+ liderazgo;
    }
}
