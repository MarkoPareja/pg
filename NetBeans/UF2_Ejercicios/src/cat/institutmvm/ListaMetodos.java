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

    public int textCount(String txt) {
        return txt.length();
    }

    public Boolean searchTxt(String txt, String letra) {
        boolean trobat;

        if (txt.contains(letra)) {
            trobat = true;
        } else {
            trobat = false;
        }
        return trobat;
    }
    
    public void hanoiTower(int n, char from_disc, char to_disc, char aux) {
        if (n == 1) {
            System.out.format("Mou el disc 1 des de %c fins a %c\n", from_disc, to_disc);
        } else {
            hanoiTower(n - 1, from_disc, aux, to_disc);
            System.out.format("Mou el disc %d des de %c fins a %c\n", n, from_disc, to_disc);
            hanoiTower(n - 1, aux, to_disc, from_disc);
        }
    }
    
    public int fibonacci(int num){
        //condició base
        if (num == 0 || num == 1){
        return num;
        }
        else{
        return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}