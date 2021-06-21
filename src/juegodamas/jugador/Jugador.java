package juegodamas.jugador;

import java.util.Scanner;

public class Jugador {
    String[] nombre = new String[10];
    int[] id = new int[10];
    int[] partidasGanadas = new int[10];
    int[] cantidadFichas = new int[10];
    Scanner entrada  = new Scanner(System.in);
    
    //constructor
    public Jugador() {
        id[0] = 1;
        id[1] = 2;
        id[2] = 3;
        id[3] = 4;
        id[4] = 5;
        id[5] = 6;
        id[6] = 7;
        id[7] = 8;
        id[8] = 9;
        id[9] = 10;
        
        nombre[0] = "1. Liu";
        nombre[1] = "2. San";
        nombre[2] = "3. Tomoe";
        nombre[3] = "4. Adrien Agreste";
        nombre[4] = "5. Ezra";
        nombre[5] = "6. Anakin";
        nombre[6] = "7. Lord Farquaad";
        nombre[7] = "8. Jack";
        nombre[8] = "9. Po";
        nombre[9] = "10. Mini-Me";
        

    }
    
    //metodos
    
    public String seleccionarPersonaje(){
        mostrarpersonajes();
        int seleccion;
        System.out.print("Ingresa el numero del personaje que elegiste: ");
        seleccion = entrada.nextInt();
        
        for (int i = 0; i < nombre.length; i++) {
            if (seleccion == id[i]) {
                System.out.println("Has selecciomado a: " + nombre[i]);
                
                break;
            }
        }
        return ""; 
    }
    
    public void mostrarpersonajes(){
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre[i]);
        }
    }

    //set get
    
    
 
}
