/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ejercicio15 {

    private static final String MSG_1 = "Escribe un numero natural";
    private static final String MSG_2 = "Vuelva a escribir un numero natural";
    private static final String MSG_3 = "Numero correcto";

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);

        do {
            numero = sc.nextInt();
            if (numero <= 1) {
                System.out.println(MSG_2);
            } else {
                System.out.println(MSG_3);
            }
        } while (numero <= 1);
    }
}