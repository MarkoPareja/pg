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
Data d’edició: 28/oct/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Ejercicio3c {

    private static final String MSG_1 = "Introdueix un nombre:";
    private static final String MSG_2 = "El nombre es positiu y menor a 100";
    private static final String MSG_3 = "El nombre es negatiu y menor a 100";
    private static final String MSG_4 = "El nombre es positiu y mayor a 100";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num >= 0) {
            if (num < 100) {
                System.out.println(MSG_2);
            } else {
                System.out.println(MSG_4);
            }
        } else {
            System.out.println(MSG_3);
        }
    }
}
