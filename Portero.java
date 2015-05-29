import java.util.Random;
/**
 * Write a description of class JugadorDeCampo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portero extends Jugador
{
    // instance variables - replace the example below with your own
    private int fortalezaMental;
    private int agilidad;
    private boolean topor;
    private static final int NUMERO_PORTERO = 1;
    /**
     * Constructor for objects of class JugadorDeCampo
     */
    public Portero()
    {
        super(NUMERO_PORTERO);
        Random random = new Random();
        fortalezaMental = random.nextInt(11);
        agilidad = random.nextInt(11);
    }  
    
    public int fortalezaMental()
    {
        return fortalezaMental;
    }
    
    public int agilidad()
    {
        return agilidad;
    }    
    
    public  int valoracion()
    {
        return (agilidad+fortalezaMental)/2;
    }
    
    public String toString()
    {
        return super.toString()+"\t Agilidad: "+ agilidad + "\t FortM. : " + fortalezaMental + "\t Valoracion: " + valoracion();
    }
}