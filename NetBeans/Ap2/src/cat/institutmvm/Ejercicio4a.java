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
public class Ejercicio4a {

    private static final String MSG_1 = "Introdueix un numero de mes: ";

    public static void main(String[] args) {
        float num;
        int fixa = 6;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextFloat();

        if (num >= 1 && num <= 12) {
            if (num == 1) {
                System.out.println("Enero");
            } else if (num == 2) {
                System.out.println("Febrero");
            } else if (num == 3) {
                System.out.println("Marzo");
            } else if (num == 4) {
                System.out.println("Abril");
            } else if (num == 5) {
                System.out.println("Mayo");
            } else if (num == 6) {
                System.out.println("Junio");
            } else if (num == 7) {
                System.out.println("Julio");
            } else if (num == 8) {
                System.out.println("Agosto");
            } else if (num == 9) {
                System.out.println("Septiembre");
            } else if (num == 10) {
                System.out.println("Octubre");
            } else if (num == 11) {
                System.out.println("Noviembre");
            } else {
                System.out.println("Diciembre");
            }
        }
    }
}
