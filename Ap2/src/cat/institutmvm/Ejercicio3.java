/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap2;

import java.util.Scanner;

/*
Nom: Marko 
Cognoms: Pareja Bailén
INS Manuel Vázquez Montalbán
Data d’edició: 28/oct/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */

public class Ejercicio3 {
    private static final String MSG_1 = "Introdueix un nombre";
    private static final String MSG_2 = "El nombre es negatiu";
    private static final String MSG_3 = "El numbre no es negatiu";
    
    public static void main(String[] args){
        int num;
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        
        num = sc.nextInt();
        
        if(num < 0){
            System.out.println(MSG_2);
        }
        else{
            System.out.println(MSG_3);
        }
    }
}