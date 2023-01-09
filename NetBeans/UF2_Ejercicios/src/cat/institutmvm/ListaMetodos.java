/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class ListaMetodos {

    public int valorCorrecte(Scanner sc) {
        boolean valorCorrecte;
        int num = 0;
        do {
            System.out.println("Introdueix un nombre: ");
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num = sc.nextInt();
            } else {
                sc.next();
                System.out.println("Error");
            }
        } while (!valorCorrecte);
        //sc.close();
        return num;
    }

    public void valida(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("El primer nombre es mes gran que el segon");
        } else if (num1 < num2) {
            System.out.println("El segon nombre es mes gran que el primer");
        } else {
            System.out.println("Els nombres son iguals");
        }
    }

    public void randomSearch(int num1) {
        int min = 15, max = 200, i;
        int[] arrayint = new int[10];
        boolean exit = false, quit = false;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < arrayint.length; i++) {
            arrayint[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }

        i = 0;
        do {
            if (i < 10) {
                if (num1 == arrayint[i]) {
                    exit = true;
                } else {
                    exit = false;
                }
                i++;
            } else {
                exit = true;
                quit = true;
            }
        } while (!quit && !exit);

        if (quit) {
            System.out.println("El nombre no s'ha trobat a la llista");
        } else {
            System.out.println("El nombre s'ha trobat a la llista");
        }
    }
}
