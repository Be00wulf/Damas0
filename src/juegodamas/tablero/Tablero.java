package juegodamas.tablero;

public class Tablero {
    private String[][] tabler0;
    String yellow="\033[33m";
    
    //constructor
    public Tablero(){
        tabler0 = new String[8][8];
        llenarTablero();
    }
    
    //metodos
    public void fichas(){
        for (int i = 0; i < tabler0.length; i++) {
            for (int j = 0; j < tabler0.length; j++) {
                if ((i+j) % 2 == 0 && j < 3) {
                    tabler0[i][j] = "X";
                    System.out.print(tabler0[i][j]);
                }
                
                else{
                    tabler0[i][j] = " "; 
                    System.out.print(tabler0[i][j]);
                }   
            }  
            System.out.println(" ");
        }
    }
    
    public void llenarTablero(){
        for (int i = 0; i < tabler0.length; i++) {
            for (int j = 0; j < tabler0.length; j++) {
                if ((i+j) % 2 == 0) {
                    tabler0[i][j] = yellow +"||||||";
                    System.out.print(tabler0[i][j]);
                }
                
                else{
                    tabler0[i][j] = "      "; 
                    System.out.print(tabler0[i][j]);
                }   
            }  
            System.out.println(" ");
        }
    }

    //get set
    public String[][] getTabler0() {
        return tabler0;
    }

    public void setTabler0(String[][] tabler0) {
        this.tabler0 = tabler0;
    }

}
