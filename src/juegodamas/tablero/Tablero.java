package juegodamas.tablero;

public class Tablero {
    private Casilla[][] tabler0;
    String yellow="\033[33m";
    private final int x,y;
    private boolean iniciarJuegoLadoBlanco;
    
    //constructor
    public Tablero(int x, int y, boolean iniciarJuegoLadoBlanco){
        this.x = x;
        this.y = y; 
        tabler0 = new Casilla[x][y];
        iniciarTablero();
        iniciarFichas(0, 3, true, "░░");
        iniciarFichas(5, 8, false, "░░");
    }
    
    //metodos
    private void iniciarFichas(int ini, int cant, boolean esBlanca, String id){
        for (int i = ini; i < cant; i++) {
            for (int j = 0; j < x; j++) {
                if (tabler0[j][i].getEsDeColor() == !iniciarJuegoLadoBlanco){
                    tabler0[j][i].setFicha(new Ficha(!esBlanca, id ));
                }
            }
            
        }
    }
    
    public boolean moverFicha(int posXIni, int posYIni, int posXFin, int posYFin){
        boolean resultado = false;
        if (tabler0[posXIni][posYIni].casillaOcupada()){
            if (!tabler0[posXFin][posYFin].casillaOcupada()){
                tabler0[posXFin][posYFin].setFicha(tabler0[posXIni][posYIni].getFicha());
                resultado = true;
            }
        }
        return resultado;
    }
    
    private void iniciarTablero(){
        boolean esColorInicio = false;
        boolean esColorIteracion = false;
        for ( int i = 0; i < y; i++) {
            esColorIteracion = !esColorInicio;
            for (int j = 0; j < x; j++) {
                tabler0[j][i] = new Casilla(esColorIteracion);
                esColorIteracion = !esColorIteracion;
                
            }
            esColorInicio = !esColorInicio;
        }
    }
    
     public void pintarTablero(){
        for ( int i = 0; i < y; i++) {            
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < x; j++) {
                    
                    System.out.print(tabler0[j][i].pintarCasilla(k));

                }
                System.out.println("   " + i);
            }
            
        }
        System.out.println("\n     0        1          2         3         4         5         6         7\n");  
    }
    
    //get set

}
