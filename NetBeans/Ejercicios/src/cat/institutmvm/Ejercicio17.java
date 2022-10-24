/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ejercicio17 {

    private static final String MSG_1 = "Introduce un numero meyor que cero: ";
    private static final String MSG_2 = "El numero ";
    private static final String MSG_4 = " es multiplo del numero ";
    private static final String MSG_5 = " no es multiplo del numero ";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            num1 = sc.nextInt();
        } while (num1 < 1);

        do {
            System.out.println(MSG_1);
            num2 = sc.nextInt();
        } while (num2 < 1);

        if (num1 % num2 == 0) {
            System.out.println(MSG_2 + num1 + MSG_4 + num2);
        } else {
            System.out.println(MSG_2 + num1 + MSG_5 + num2);
        }
    }

}
