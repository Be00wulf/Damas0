package juegodamas.principal;

import java.util.Scanner;
import juegodamas.jugador.Jugador;
import juegodamas.pptlg.PiedraPTLS;
import juegodamas.tablero.Ficha;
import juegodamas.tablero.Tablero;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    int menuSel, pX, pY, mX, mY;
    int ficha1 = 12, ficha2 = 12;
    int sel;
    
    //const
    public Menu(){
        mostrarMenuPrincipal();
    }
    
    //met
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
            System.out.print("\nIngresa el numero de la opcion que deseas realizar: ");
            menuSel = entrada.nextInt();

            switch(menuSel){
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
                    
                    Tablero t = new Tablero(8, 8,true);
                    do {    
                        t.pintarTablero();
                        System.out.println("Ingrese la POSICION X, de la ficha que desea seleccionar");
                        System.out.print("Poicion X = ");
                        pX = entrada.nextInt();
                        
                        System.out.println("Ingrese la POSICION Y, de la ficha que desea seleccionar");
                        System.out.print("Poicion Y = ");
                        pY = entrada.nextInt();
                        
                        System.out.println("Ingrese el MOVIMIENTO X, de la ficha que desea mover");
                        System.out.print("Movmiento X = ");
                        mX = entrada.nextInt();
                        
                        System.out.println("Ingrese el MOVIMIENTO Y, de la ficha que desea mover");
                        System.out.print("Movmiento Y = ");
                        mY = entrada.nextInt();
                        
                        //t.pintarTablero();
                        System.out.println(t.moverFicha(pX, pY, mX, mY));
                        System.out.println(t.comerFicha(pX, pY, mX, mY));
                        
                        
                    } while (ficha1 > 0 || ficha2 > 0);
                    

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
                
                default: System.out.println("\nNO SE HA ENCONTRADO LA OPCIÃ“N, VUELVE A INTENTAR"); 
            }
   
        } while (menuSel < 1 || menuSel > 3);
    }
    
    
    
    
    
    
    
    
}
