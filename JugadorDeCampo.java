import java.util.Random;
/**
 * Write a description of class JugadorDeCampo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JugadorDeCampo extends Jugador
{
    // instance variables - replace the example below with your own
    private int pase;
    private int regate;
    private int remate;
    private int liderazgo;    

    /**
     * Constructor for objects of class JugadorDeCampo
     */
    public JugadorDeCampo(int dorsal)
    {
        super(dorsal);
        Random random = new Random();
        pase = random.nextInt(11);
        regate = random.nextInt(11);
        remate = random.nextInt(11);
    }   

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int valoracion()
    {
        return (pase+regate+remate) /3;
    }

    public String toString()
    {
        return super.toString()+"\t Pase: "+ pase + "\t Regate: " + regate + "\t Remate: "+ remate + "\t Valoracion: " + valoracion();
    }
}
