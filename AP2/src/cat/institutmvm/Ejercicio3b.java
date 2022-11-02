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
public class Ejercicio3b {

    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "El nombre es mes gran que 35";
    private static final String MSG_3 = "El nombre es mes petit que 35";
    private static final String MSG_4 = "El nombre es igual que 35";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();

        if (num > 35) {
            System.out.println(MSG_2);
        } else if (num == 35) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_3);
        }
    }
}
