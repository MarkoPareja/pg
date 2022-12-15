/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ejercicio19 {

    private static final String MSG_1 = "Introduce 20 numeros de uno en uno: ";
    private static final String MSG_2 = "Total parells ";
    private static final String MSG_3 = "Total senars ";

    public static void main(String[] args) {
        int num, parell = 0, senar = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println(MSG_1);
            num = sc.nextInt();
            if (num % 2 == 0) {
                parell++;
            } else {
                senar++;
            }
        }

        System.out.println(MSG_2 + parell);
        System.out.println(MSG_3 + senar);
    }
}
