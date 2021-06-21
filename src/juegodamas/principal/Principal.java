package juegodamas.principal;

import java.util.Scanner;
import juegodamas.jugador.Jugador;
import juegodamas.pptlg.PiedraPTLS;
import juegodamas.tablero.*;

public class Principal {
    Scanner entrada = new Scanner(System.in);
    int menu, pX, pY, mX, mY;
    int ficha1 = 12, ficha2 = 12;
    int sel;
    
    public static void main(String[] args) {
        Principal p1 = new Principal();

        
        
    }
    
    public Principal(){
        Tablero t1 = new Tablero(8, 8, true);
        
        t1.pintarTablero();
        
        System.out.println(t1.moverFicha(0, 0, 5, 5));
        /*t1.pintarTablero();
        
        System.out.println(t1.moverFicha(2, 4, 2, 2));
        t1.pintarTablero();*/
        
        
    }

    //metodos
    
    

}