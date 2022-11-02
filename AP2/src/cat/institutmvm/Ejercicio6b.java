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
public class Ejercicio6b {

    private static final String MSG_1 = "Introdueix un any i un mes: ";
    private static final String MSG_2 = "El mes te 29 dies";
    private static final String MSG_3 = "El mes te 28 dies";
    private static final String MSG_4 = "El mes te 30 dies";
    private static final String MSG_5 = "El mes te 31 dies";

    public static void main(String[] args) {
        int mes, any, resultatCase;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();

        if (mes % 2 == 0) {
            if (mes == 2) {
                if (any % 4 == 0) {
                    resultatCase = 2;
                } else {
                    resultatCase = 1;
                }
            } else {
                resultatCase = 3;
            }
        } else {
            resultatCase = 4;
        }

        switch (resultatCase) {
            case 1:
                System.out.println(MSG_3);
                break;
            case 2:
                System.out.println(MSG_2);
                break;
            case 3:
                System.out.println(MSG_4);
                break;
            case 4:
                System.out.println(MSG_5);
                break;
        }
    }
}
