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
public class Ejercicio26 {

    private static final String MSG_1 = "Introduce 20 números: ";

    public static void main(String[] args) {
        int[] arrayInt = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = sc.nextInt();
            if (arrayInt[i] % 5 == 0) {
                arrayInt[i] = arrayInt[i] + 3;
            } else {
                if (arrayInt[i] % 3 == 0) {
                    arrayInt[i] = arrayInt[i] - 2;
                }
            }
        }
        System.out.println("\nResultat:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
    }
}
