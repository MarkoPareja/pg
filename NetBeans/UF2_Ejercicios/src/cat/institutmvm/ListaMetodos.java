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
            System.out.print("Introdueix un nombre: ");
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

    public int random(int max) {
        int min = 0, num;

        num = (int) Math.floor(Math.random() * (max - min) + min);
        return num;
    }

    public boolean searchNum(int num, int num2) {
        boolean trobat = false;

        if (num == num2) {
            trobat = true;
        }
        return trobat;
    }
    
    public int textCount(String txt){
        int contador = txt.length();
        return contador;
    }
}