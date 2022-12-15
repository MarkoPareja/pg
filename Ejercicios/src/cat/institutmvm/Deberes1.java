/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

//Recibir dos numeros y que debuelva la división
import java.util.Scanner;

public class Deberes1 {

    private static final String MSG_1 = "Este es el resultado de la división: ";
    private static final String MSG_2 = "Ingresa un numero";
    private static final String MSG_3 = "Numero 0 no valido prueba otra vez";

    public static void main(String[] args) {
        float num1, num2, cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_2);
        num1 = sc.nextFloat();

        do {

            if (cont == 0) {
                System.out.println(MSG_2);
            } else {
                System.out.println(MSG_3);
            }

            num2 = sc.nextFloat();
            cont++;

        } while (num2 == 0);

        System.out.println(MSG_1 + num1 / num2);
    }
}
