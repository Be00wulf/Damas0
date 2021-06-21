package juegodamas.tablero;

public class Casilla {
    private boolean esDeColor;
    private Ficha ficha;
    private char celda = '░', casillaColor = '░';
    
    //colores
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN = "\u001B[32m";

    //constructor
    public Casilla(boolean esDeColor){
        this.esDeColor = esDeColor;
        this.ficha = null;
    }
        
    //metodos
    public boolean casillaOcupada(){
        return (ficha != null);
    }
    
    public String pintarCasilla(int linea){
        String res = "";
        if(esDeColor){
            res = imprimir(ANSI_WHITE, linea);
        }
        else{
            res = imprimir(ANSI_GREEN, linea);
        }

        return res;
    }
    
    private String imprimir(String color, int linea){
        String res = "";
        if(ficha!=null){
            if ((linea == 0)||(linea == 2))
                res=""+ color + casillaColor + casillaColor + ficha.getCaracter() + ficha.getCaracter() + color+ casillaColor + casillaColor;
            if (linea == 1)
                res="" + color+casillaColor+ficha.getCaracter()+ficha.getId()+ficha.getCaracter()+color+casillaColor;
   
        }else{
            res =""+ color+casillaColor+casillaColor+casillaColor+casillaColor+casillaColor+casillaColor;
        }

        return res;
    }
    
    //set get
    public void setFicha(Ficha ficha) {
        this.ficha = null;
    }

    public boolean getEsDeColor() {
        return this.esDeColor;
    }
    
    public Ficha getFicha(){
        Ficha tmp = this.ficha;
        this.ficha = null;
        return tmp;
    }

}