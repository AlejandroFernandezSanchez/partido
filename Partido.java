
/**
 * Write a description of class Partido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Partido
{
    // instance variables - replace the example below with your own
    private Equipo local;
    private Equipo visitante;

    /**
     * Constructor for objects of class Partido
     */
    public Partido(Equipo local, Equipo visitante)
    {
        this.local = local;
        this.visitante = visitante;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void mostrarAlineaciones()
    {
        local.printEquipo();
        System.out.println("\n");
        visitante.printEquipo();
    }
}
