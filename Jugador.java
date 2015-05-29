import java.util.Random;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Jugador
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private int forma;  
    private int dorsal;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int dorsal)
    {
        String[] nombres = {"Ramon", "Pedro", "Juan", "Mario", "Marcos", "Miguel", "Luis", "Carlos", 
                "Jose Ramon", "Federico", "Alberto", "Roberto", "Ruben", "Guillermo", "Hector", 
                "Mario", "Felipe", "Manuel", "Tomas", "Agustin", "Jose Manuel", "Juan Jesus", 
                "Pepe", "Ricardo", "Fernando", "Antonio", "Jose Alberto", "Jose Luis", "David", 
                "Emilio", "Cesar", "German", "Raul", "Pablo"};
        Random random = new Random();
        nombre = nombres[random.nextInt(nombres.length)];
        edad = 18 + random.nextInt(22);
        forma = random.nextInt(11);
        this.dorsal=dorsal;

    }

    /**   
     * 
     */
    public String getNombre()
    {
        return nombre;
    }

    /**   
     * 
     */
    public int getEdad()
    {
        return edad;
    }

    /**   
     * 
     */
    public int getForma()
    {
        return forma;
    }

    /**   
     * 
     */
    public int getDorsal()
    {
        return dorsal;
    
    }

    

    public abstract int valoracion();
    
    public  String toString()
    {
        String string = "Dorsal " + dorsal+". "+ nombre+" ("+edad+" anos )\t\tForma: " + forma;
        return string;
    }
}
