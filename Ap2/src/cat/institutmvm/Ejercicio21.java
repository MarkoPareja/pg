/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ejercicio21 {
    private static final String MSG_1 = "Introduce 20 numeros: ";

    public static void main(String[] args) {
        int[] arrayint = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);  
        
        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("\nResultat:");
        for (int i = arrayint.length-1; i >= 0; i--) {
            System.out.println(arrayint[i] + " ");
        }
        System.out.println("\n");
    }
}