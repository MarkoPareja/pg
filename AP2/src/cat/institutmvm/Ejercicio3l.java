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
public class Ejercicio3l {

    private static final String MSG_1 = "Introdueix cuantitat de llitres";
    private static final String MSG_2 = "La cuota a pagar es: ";
    private static final Integer FIX = 6;
    private static final String MSG_3 = "€";

    public static void main(String[] args) {
        float num;
        int fixa = 6;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextFloat();

        if (num <= 50) {
            System.out.println(MSG_2 + FIX + MSG_3);
        } else if (num >= 50 && num <= 200) {
            total = (num * 0.1);
            System.out.println(MSG_2 + total + MSG_3);
        } else {
            total = (num * 0.3);
            System.out.println(MSG_2 + total + MSG_3);
        }
    }
}
