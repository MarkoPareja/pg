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
public class Ejercicio3e {

    private static final String MSG_1 = "Introdueix un nombre:";
    private static final String MSG_2 = "El nombre si pertany a l'interval 25 al 50";
    private static final String MSG_3 = "El nombre no pertany a l'interval 25 al 50";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num >= 25 && num <= 50) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
