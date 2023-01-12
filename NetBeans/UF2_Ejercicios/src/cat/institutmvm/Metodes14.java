/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Metodes14 {
    private static final String MSG_1 = "El numero ";
    private static final String MSG_2 = " s'ha trobat";
    private static final String MSG_3 = " no s'ha trobat";
    
    public static void main(String[] args) {
        int[] arrayint = new int[10];
        int num1, num2 = 0, i;
        boolean trobat = false;
        Scanner sc = new Scanner(System.in);

        ListaMetodos method = new ListaMetodos();

        num1 = method.valorCorrecte(sc);

        for (i = 0; i < arrayint.length; i++) {
            num2 = method.random(200);
            arrayint[i] = num2;
        }

        i = 0;
        while (!trobat && i < arrayint.length) {
            trobat = method.searchNum(num1, arrayint[i]);
            i++;
        }
        
        /*
        if (trobat) {
            System.out.println("El numero " + num1 + "s'ha trobat");
        } else {
            System.out.println("El numero " + num1 + " no s'ha trobat");
        }*/
        
        System.out.println((trobat) ? (MSG_1 + num1 + MSG_2) : (MSG_1 + num1 + MSG_3));

        sc.close();
    }
}