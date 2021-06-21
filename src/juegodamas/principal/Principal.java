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
        
        /*System.out.println(t1.moverFicha(0, 0, 5, 5));
        t1.pintarTablero();
        
        System.out.println(t1.moverFicha(2, 4, 2, 2));
        t1.pintarTablero();*/
        
        mostrarMenuPrincipal();
    }

    //metodos
    public void mostrarMenuPrincipal(){
        System.out.println("⣇⣿⠘⣿⣿⣿⡿⡿⣟⣟⢟⢟⢝⠵⡝⣿⡿⢂⣼⣿⣷⣌⠩⡫⡻⣝⠹⢿⣿⣷\n" +
                            "⡆⣿⣆⠱⣝⡵⣝⢅⠙⣿⢕⢕⢕⢕⢝⣥⢒⠅⣿⣿⣿⡿⣳⣌⠪⡪⣡⢑⢝⣇\n" +
                            "⡆⣿⣿⣦⠹⣳⣳⣕⢅⠈⢗⢕⢕⢕⢕⢕⢈⢆⠟⠋⠉⠁⠉⠉⠁⠈⠼⢐⢕⢽\n" +
                            "⡗⢰⣶⣶⣦⣝⢝⢕⢕⠅⡆⢕⢕⢕⢕⢕⣴⠏⣠⡶⠛⡉⡉⡛⢶⣦⡀⠐⣕⢕\n" +
                            "⡝⡄⢻⢟⣿⣿⣷⣕⣕⣅⣿⣔⣕⣵⣵⣿⣿⢠⣿⢠⣮⡈⣌⠨⠅⠹⣷⡀⢱⢕           JUEGO DE DAMAS\n" +
                            "⡝⡵⠟⠈⢀⣀⣀⡀⠉⢿⣿⣿⣿⣿⣿⣿⣿⣼⣿⢈⡋⠴⢿⡟⣡⡇⣿⡇⡀⢕\n" +
                            "⡝⠁⣠⣾⠟⡉⡉⡉⠻⣦⣻⣿⣿⣿⣿⣿⣿⣿⣿⣧⠸⣿⣦⣥⣿⡇⡿⣰⢗⢄          1. JUGAR\n" +
                            "⠁⢰⣿⡏⣴⣌⠈⣌⠡⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣬⣉⣉⣁⣄⢖⢕⢕⢕          2. VER TABLA DE PUNTUACIONES\n" +
                            "⡀⢻⣿⡇⢙⠁⠴⢿⡟⣡⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣵⣵⣿          3. Salir\n" +
                            "⡻⣄⣻⣿⣌⠘⢿⣷⣥⣿⠇⣿⣿⣿⣿⣿⣿⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                            "⣷⢄⠻⣿⣟⠿⠦⠍⠉⣡⣾⣿⣿⣿⣿⣿⣿⢸⣿⣦⠙⣿⣿⣿⣿⣿⣿⣿⣿⠟\n" +
                            "⡕⡑⣑⣈⣻⢗⢟⢞⢝⣻⣿⣿⣿⣿⣿⣿⣿⠸⣿⠿⠃⣿⣿⣿⣿⣿⣿⡿⠁⣠\n" +
                            "⡝⡵⡈⢟⢕⢕⢕⢕⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⠿⠋⣀⣈⠙\n" +
                            "⡝⡵⡕⡀⠑⠳⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⢉⡠⡲⡫⡪⡪⡣");
        
        
        do {       
            System.out.print("\nIngresa el numero de la opción que deseas realizar: ");
            menu = entrada.nextInt();

            switch(menu){
                case 1:
                    System.out.println("\nJUGAR");
                    System.out.println("Selecciona un jugador");
                    Jugador j1 = new Jugador();
                    System.out.print("\t***Jugador 1***  " +  j1.seleccionarPersonaje() + "\n\n\n\n");
                    Jugador j2 = new Jugador();
                    System.out.print("\t***Jugador 2***  " +  j2.seleccionarPersonaje() + "\n\n\n\n");
                    
                    System.out.println("DUELO INICIAL");
                    PiedraPTLS p1 = new PiedraPTLS();
                    System.out.println();
                    
                    mostrarMenuPrincipal();
                break;
                
                case 2:
                    System.out.println("\nTABLA DE PUNTUACIONES");
                    Jugador j3 = new Jugador();
                    System.out.println(j3.est());
                    mostrarMenuPrincipal();
                break;
                
                case 3:
                    System.out.println("\nADIOS");
                break;
                
                default: System.out.println("\nNO SE HA ENCONTRADO LA OPCIÓN, VUELVE A INTENTAR"); 
            }
   
        } while (menu < 1 || menu > 3);
    }
    

}