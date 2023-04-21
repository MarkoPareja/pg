/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.ui;
import cat.institutmvm.entities.Pacient;
import cat.institutmvm.entities.Urgencia;
import java.util.Scanner;
/**
 * Este programa gestiona urgencias medicas, recibiendo informacion sobre el paciente.
 * @author alumne_1r
 */
public class main {
    private static final String MSG_1 = "+---------------------+";
    private static final String MSG_2 = "|    DADES PACIENT    |";
    private static final String MSG_3 = "+---------------------+";
    private static final String MSG_4 = "DNI: ";
    private static final String MSG_5 = "NOM: ";
    private static final String MSG_6 = "COGNOMS: ";
    private static final String MSG_7 = "TSI: ";
    private static final String MSG_8 = "MOTIU DE LA VISITA: ";
    private static final String MSG_9 = "REGISTRE DE VISITA";
    /**
     * En esta clase gestionamos los datos del paciente.
     * @param args 
     */
    public static void main(String[] args) {
        String dni, nom, cognom, tsi, motiu;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println(MSG_1);
        System.out.println(MSG_2);
        System.out.println(MSG_3);
         
        System.out.print("\n"+MSG_4);
        dni = sc.nextLine();
        System.out.print("\n"+MSG_5);
        nom = sc.nextLine();
        System.out.print("\n"+MSG_6);
        cognom = sc.nextLine();
        System.out.print("\n"+MSG_7);
        tsi = sc.nextLine();
        System.out.print("\n"+MSG_8);
        motiu = sc.nextLine();
        
        Pacient pacient = new Pacient(dni, nom, cognom, tsi, motiu);
        
        Urgencia urgencia = new Urgencia("17-04-2023", dni, 0);
        urgencia.setTorn(urgencia.random(50000));
        
        System.out.println("\n"+MSG_9);
        System.out.printf("%-20s%-20s%-20s%-20s%n", "DATA",
                "TORN","DNI","NIVELL");
        System.out.printf("%-20s%-20s%-20s%-20s%n",urgencia.getData()
                ,urgencia.getTorn(),urgencia.getDni(),
                urgencia.getNivell());
    }
    
}
