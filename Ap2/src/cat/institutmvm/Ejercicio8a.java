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
public class Ejercicio8a {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "Torna a introduir un nombre: ";
    
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        num = sc.nextInt();
        
        while (num != 0){
            System.out.println(MSG_2);
            num = sc.nextInt();
        }
    }
}
