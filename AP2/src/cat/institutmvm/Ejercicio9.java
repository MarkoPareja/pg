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
public class Ejercicio9 {
    private static final String MSG_1 = "Introdueix un nombre (cuan fiquis 0 terminara): ";
    private static final String MSG_2 = "La mitjana dels números introduïts es: ";

    public static void main(String[] args) {   
        int num, suma = 0, quantitat = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        
        num = sc.nextInt();
        
        while(num != 0) {
            quantitat = quantitat + 1;
            suma = suma + num;
            num = sc.nextInt();
        }
        
        System.out.println(MSG_2 + (suma / quantitat));
    }
}