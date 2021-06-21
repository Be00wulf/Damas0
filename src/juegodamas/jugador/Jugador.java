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
        for (int i = 0; i < 10; i++) {
            id[i] = (i+1);
        }

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
        
        est();

    }
    
    //metodos
    public void est(){
        partidasGanadas[0] = 1;
        for (int i = 1; i < 10; i++) {
            partidasGanadas[i] = 0;
        }
    }
    
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
