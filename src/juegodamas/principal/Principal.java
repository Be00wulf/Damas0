package juegodamas.principal;

import java.util.Scanner;
import juegodamas.jugador.Jugador;
import juegodamas.tablero.Ficha;
import juegodamas.tablero.*;

public class Principal {
    public static void main(String[] args){
        Tablero t = new Tablero(8, 8,true);

        t.pintarTablero();
        System.out.println(t.moverFicha(0, 0, 5, 5));
        /*t.pintarTablero();
        System.out.println(t.moverFicha(5, 5, 1, 1));
        t.pintarTablero();*/
/* 
        Celda t = new Celda(true);
        t.setFicha(new Ficha(true));
        System.out.println(t.pintarCelda(0));
        System.out.println(t.pintarCelda(1));
        System.out.println(t.pintarCelda(2));
*/
    }


    
    

}