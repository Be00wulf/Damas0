package juegodamas.pptlg;

import java.util.Scanner;

public class PiedraPTLS {
    Scanner entrada = new Scanner(System.in);
    int jugador1, jugador2;
    
    //constructor
    public PiedraPTLS(){
        dibujinXD();
        seleccionar();
        yanKenPo();
        System.out.println("\n\n\n\n");
    }

    //metodos
    public void yanKenPo(){
        do {       
           if (jugador1 != jugador2 ) {
                if (jugador1 == 1 && jugador2 == 3 || jugador1 == 1 && jugador2 == 4) {
                    System.out.println("EL JUGADOR 1 HA GANADO");
                    break;
                } 

                else if (jugador1 == 2 && jugador2 == 1 ||jugador1 == 2 && jugador2 == 5) {
                    System.out.println("EL JUGADOR 1 HA GANADO");
                    break;
               
                } else  if (jugador1 == 3 && jugador2 == 2 || jugador1 == 3 && jugador2 == 4) {
                    System.out.println("EL JUGADOR 1 HA GANADO");   
                    break;
               
                } else if (jugador1 == 4 && jugador2 == 2 || jugador1 == 4 && jugador2 == 5) {
                    System.out.println("EL JUGADOR 1 HA GANADO");
                    break;
                    
                } else if (jugador1 == 5 && jugador2 == 1 || jugador1 == 5 && jugador2 == 3) {
                    System.out.println("EL JUGADOR 1 HA GANADO");
                    break;
                }
                else {
                    System.out.println("EL JUGADOR 2 HA GANADO");
                    break;
                }

            } else {
                System.out.println("\nEMPATE, DECIDAMOSLO EN OTRA RONDA\n\n\n");
                seleccionar();
            }

        } while (jugador1 != jugador2);
        
    }
    
    public void seleccionar(){
        System.out.print("REGLAS DE PIEDRA PAPEL TIJERA LAGARTO SPOCK\n"
                       + "Tijera corta a papel, papel tapa a piedra, piedra aplasta a lagarto, lagarto envenena a Spock, \n"
                       + "Spock rompe a tijera, tijera decapita a lagarto, lagarto devora a papel, papel desautoriza a Spock, \n"
                       + "Spock vaporiza a piedra, y como siempre, piedra aplasta a tijera\n"
                       + "1. Piedra\n"
                       + "2. Papel\n"
                       + "3. Tijera\n"
                       + "4. Lagarto\n"
                       + "5. Spock\n"
                       + "JUGADOR 1, ingresa el numero de la opcion: ");
        jugador1 = entrada.nextInt();
        
        for (int i = 0; i < 50; i++) {      //para que no vea XD y se "reinicie" la pantalla
            System.out.println("");
        }
        
        System.out.print("REGLAS DE PIEDRA PAPEL TIJERA LAGARTO SPOCK\n"
                       + "Tijera corta a papel, papel tapa a piedra, piedra aplasta a lagarto, lagarto envenena a Spock, \n"
                       + "Spock rompe a tijera, tijera decapita a lagarto, lagarto devora a papel, papel desautoriza a Spock, \n"
                       + "Spock vaporiza a piedra, y como siempre, piedra aplasta a tijera\n"
                       + "1. Piedra\n"
                       + "2. Papel\n"
                       + "3. Tijera\n"
                       + "4. Lagarto\n"
                       + "5. Spock\n"
                       + "JUGADOR 2, ingresa el numero de la opcion: ");
        jugador2 = entrada.nextInt();
        
        for (int i = 0; i < 4; i++) {      
            System.out.println("");         //saltos de linea
        }
    }
    
    public void dibujinXD(){
        System.out.println("     :                                 :\n" +
"   :                                   :\n" +
"   :  RRVIttIti+==iiii++iii++=;:,       :\n" +
"   : IBMMMMWWWWMMMMMBXXVVYYIi=;:,        :\n" +
"   : tBBMMMWWWMMMMMMBXXXVYIti;;;:,,      :\n" +
"   t YXIXBMMWMMBMBBRXVIi+==;::;::::       ,\n" +
"  ;t IVYt+=+iIIVMBYi=:,,,=i+=;:::::,      ;;\n" +
"  YX=YVIt+=,,:=VWBt;::::=,,:::;;;:;:     ;;;\n" +
"  VMiXRttItIVRBBWRi:.tXXVVYItiIi==;:   ;;;;\n" +
"  =XIBWMMMBBBMRMBXi;,tXXRRXXXVYYt+;;: ;;;;;\n" +
"   =iBWWMMBBMBBWBY;;;,YXRRRRXXVIi;;;:;,;;;=\n" +
"    iXMMMMMWWBMWMY+;=+IXRRXXVYIi;:;;:,,;;=\n" +
"    iBRBBMMMMYYXV+:,:;+XRXXVIt+;;:;++::;;;\n" +
"    =MRRRBMMBBYtt;::::;+VXVIi=;;;:;=+;;;;=\n" +
"     XBRBBBBBMMBRRVItttYYYYt=;;;;;;==:;=\n" +
"      VRRRRRBRRRRXRVYYIttiti=::;:::=;=\n" +
"       YRRRRXXVIIYIiitt+++ii=:;:::;==\n" +
"       +XRRXIIIIYVVI;i+=;=tt=;::::;:;\n" +
"        tRRXXVYti++==;;;=iYt;:::::,;;\n" +
"         IXRRXVVVVYYItiitIIi=:::;,::;\n" +
"          tVXRRRBBRXVYYYIti;::::,::::\n" +
"           YVYVYYYYYItti+=:,,,,,:::::;\n" +
"           YRVI+==;;;;;:,,,,,,,:::::::");
    }
    
}
