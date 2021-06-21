package juegodamas.jugador;

import juegodamas.principal.Datos;

public class VectorJugador {
    private Jugador[] jugadores = new Jugador[10];
    private int sig;

    //constructor
    public VectorJugador(){
        sig = 1;
    }    
    
    //metodos
    public void agregarJugador(String nombre, int partidasGanadas, int cantidadFichas){
        if (sig > 10){
            System.out.println("Li­mite de jugadores alcanzado");
        }
        else{
            //jugadores[(sig-1)] = new Jugador(nombre, partidasGanadas, cantidadFichas);
        }
        sig++;
    }

    public void agregarJugador(){
        String nombre = Datos.getTexto("Ingresa el nombre del jugador");
        agregarJugador(nombre, sig, sig);
    }
    
    
    
    
}