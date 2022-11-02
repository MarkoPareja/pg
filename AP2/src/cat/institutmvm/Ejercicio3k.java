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
public class Ejercicio3k {

    private static final String MSG_1 = "Introdueix dos nombres:";
    private static final String MSG_2 = "Els numeros son multiples";
    private static final String MSG_3 = "Els numeros no son multiples";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
