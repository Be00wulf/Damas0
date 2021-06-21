package juegodamas.principal;

import java.util.Scanner;

public class Datos {
    static Scanner scanner = new Scanner(System.in);
    
    private static void imprimirMensaje(String mensaje){
        System.out.print("\n"+mensaje+" ");
    }
    
    public static String getTexto(String mensaje){
        imprimirMensaje(mensaje);
        String res = scanner.nextLine();
        return res;
    }
    
}
