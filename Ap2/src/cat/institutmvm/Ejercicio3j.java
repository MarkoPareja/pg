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
public class Ejercicio3j {

    private static final String MSG_1 = "Introdueix tres nombres:";
    private static final String MSG_2 = "El nombre mes gran es: ";

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 < num3) {
                System.out.println(MSG_2 + num3);
            }
            System.out.println(MSG_2 + num1);
        } else if (num3 > num2) {
            System.out.println(MSG_2 + num3);
        } else {
            System.out.println(MSG_2 + num2);
        }
    }
}
