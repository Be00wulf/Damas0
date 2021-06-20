package juegodamas.tablero;

public class Ficha {
    //variables
    private boolean esNegra;
    private char celda = '░', celdaColor = '░';
    private String id;
    
    //CONSTANTES DE colores
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    
    //constructor
    public Ficha(boolean esNegra, String id){
        this.esNegra = esNegra;
        this.id = id;
    }
    
    //get set
    public String getCaracter(){
        String res =(esNegra)?"" + ANSI_PURPLE + celda: "" + ANSI_RED + celda;
        return res;
    }
    
    public String getId() {
        return id;
    }
  
}
