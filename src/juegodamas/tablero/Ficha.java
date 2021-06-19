package juegodamas.tablero;

public class Ficha {
    //variables
    private boolean esNegra;
    private char celda = '░', celdaColor = '░';
    private String id;
    
    //CONSTANTES DE colores
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    //constructor
    public Ficha(boolean esNegra, String id){
        this.esNegra = esNegra;
        this.id = id;
    }
    
    //get set
    public String getCaracter(){
        String res =(esNegra)?"" + ANSI_GREEN + celda: "" + ANSI_YELLOW + celda;
        return res;
    }
    
    public String getId() {
        return id;
    }
  
}
