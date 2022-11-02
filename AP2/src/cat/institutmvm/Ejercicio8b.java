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
public class Ejercicio8b {
    private static final String MSG_1 = "Digues quants números vols introduir: ";
    private static final String MSG_2 = "Has d’introduir ";
    private static final String MSG_3 = "Introdueix un número: ";
    private static final String MSG_4 = "Gràcies per utilitzar aquest programa.";
    
    public static void main(String[] args) {   
        int quantitat, i= 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        
        quantitat = sc.nextInt();  
        
        System.out.println(MSG_2 + quantitat + " numeros");
        
        sc.nextInt();
        
        System.out.println(MSG_3);
        
        while(i < quantitat) {
            i++;
            sc.nextInt();
            if(quantitat == i){
                break;
            }
            System.out.println(MSG_3);
        }
        System.out.println(MSG_4);
    }
}