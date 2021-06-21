package juegodamas.tablero;

public class Tablero {
    private Casilla[][] tablero; 
    private final int x,y;
    private boolean juegoEnBlancas;
    
     public Tablero(int x, int y, boolean juegoEnBlancas){
        this.juegoEnBlancas = juegoEnBlancas;
        this.x = x;
        this.y = y;
        tablero = new Casilla[x][y];
        inicializarTablero();
        inicializarFichas(0, 3, true, "░░");
        inicializarFichas(5, 8, false, "░░");

    }

     private void inicializarFichas(int ini, int cant, boolean esBlanca, String id){
        for (int i = ini; i < cant; i++) {
            for (int j = 0; j < x; j++) {
                if (tablero[j][i].getEsColor() == !juegoEnBlancas){
                    tablero[j][i].setFicha(new Ficha(!esBlanca, id ));
                }
            }
        }
    }
     
    //INICIO EDIT MAJO
    public boolean  comerFicha(int posXIni, int posYIni, int posXFin, int posYFin){
        boolean resultado = false;
        if (tablero[posXIni][posYIni].ocupadaPorFicha()){
            if (tablero[posXFin][posYFin].ocupadaPorFicha()){
                tablero[posXFin][posYFin].desocupadaPorFicha();
                tablero[posXFin][posYFin].setFicha(tablero[posXIni][posYIni].getFicha());
                resultado = true;
            }
        }
        return resultado;
    }
     //FIN EDIT MAJO

      public boolean moverFicha(int posXIni, int posYIni, int posXFin, int posYFin){
        boolean resultado = false;
        if (tablero[posXIni][posYIni].ocupadaPorFicha()){
            if (!tablero[posXFin][posYFin].ocupadaPorFicha()){
                tablero[posXFin][posYFin].setFicha(tablero[posXIni][posYIni].getFicha());
                resultado = true;
            }
        }
        return resultado;
    }

    private void inicializarTablero(){
        boolean esColorInicio = false;
        boolean esColorIteracion = false;
        for ( int i = 0; i < y; i++) {
            esColorIteracion = !esColorInicio;
            for (int j = 0; j < x; j++) {
                tablero[j][i] = new Casilla(esColorIteracion);
                esColorIteracion = !esColorIteracion;
                
            }
            esColorInicio = !esColorInicio;
        }
    }
    public void pintarTablero(){
        for ( int i = 0; i < y; i++) {            
            
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(tablero[j][i].pintarCelda(k));
                }
                System.out.println("   " + i);
            }
            
        }
        System.out.println("\n     0        1          2         3         4         5         6         7\n");
    }
     
}
