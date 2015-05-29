import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.Collections;
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<Jugador> jugadores;    
    private ArrayList<Jugador> reservas;

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombre, int maximo)
    {        
        Random random = new Random();
        jugadores = new ArrayList<>();
        reservas = new ArrayList<>();
        if(maximo<11) //Si el valor del maximo e smenor del minimo, se le asigna 11
            maximo=11;
        this.nombre=nombre;
        int numCapitan = 2+ random.nextInt(maximo-2); //el jugador que tenga este numero sera capitan
        jugadores.add(new Portero());
        for (int i = 2; i<maximo; i++)
        {
            if(i==numCapitan)
                jugadores.add(new Capitan(i));
            else if (i>11)         
                reservas.add(new JugadorDeCampo(i));   
            else
                jugadores.add(new JugadorDeCampo(i));
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Jugador getJugador(int i)
    {
        return jugadores.get(i);
    }
    
    public Jugador getReserva(int i)
    {
        return jugadores.get(i);
    }
    
    public float getValoracionMediaTitulares()
    {
        float suma = 0;
        for(Jugador jugador : jugadores)
        {
            suma += jugador.valoracion();
        }
        return suma/jugadores.size();
    }
    
     public void printEquipo()
    {
        System.out.println(nombre);
        System.out.println("Titulares:");
        
        ArrayList<Jugador> jugadoresClon = (ArrayList<Jugador>) jugadores.clone(); //crea un clon del array
        System.out.println(jugadoresClon.get(0));
        jugadoresClon.remove(0);
        //imprimimos al portero y lo borramos
        Iterator itTitulares = jugadoresClon.iterator();
        Collections.shuffle(jugadoresClon, new Random()); //lo mezclamos
        Collections.shuffle(reservas, new Random()); //lo mezclamos
        for (Jugador jugador : jugadoresClon)
        {
            System.out.println(jugador);
        }
        System.out.println("*************************** Media de valoracion del equipo titular: " + getValoracionMediaTitulares()+ " ***************************");
        for (Jugador jugador : reservas)
        {
            System.out.println(jugador);
        }
    }
}
