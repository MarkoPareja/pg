/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*
Nom: Marko 
Cognoms: Pareja Bailén
INS Manuel Vázquez Montalbán
Data d’edició: 1/nov/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Ejercicio4b {
    private static final String MSG_1 = "Introdueix un numero de mes: ";
    
    public static void main(String[] args) {       
        int num;    
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        num = sc.nextInt();
        
        if (num >= 1 || num <= 12) {
            switch (num) {
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiempre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    break;
            }
        }
    }
}