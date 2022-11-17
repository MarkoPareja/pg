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
public class Ejercicio29 {

    private static final String MSG_1 = "Introduce 20 numeros: ";

    public static void main(String[] args) {
        int i;
        int[] arrayint = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        
        for (i = 0; i < arrayint.length; i++) {
            do{
                arrayint[i] = sc.nextInt();
            }while (arrayint[i] <1 || arrayint[i] >9);
        }
        
        System.out.println("\nResultat:");
        for (i = 0; i < arrayint.length; i++) {
            System.out.print(arrayint[i] + " ");
        }
        System.out.println("\n");
        System.out.println("\nResultat:");
        for (i = arrayint.length-1; i >= 0; i--) {
            System.out.print(arrayint[i] + " ");
        }
        System.out.println("\n");
    }
}