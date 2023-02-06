/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.metodos;

import java.util.Scanner;

public class metodos {

    public int valorCorrecte(Scanner sc, String MSG_1, String MSG_2) {
        boolean valorCorrecte;
        int num = 0;
        System.out.print(MSG_1);
        valorCorrecte = sc.hasNextInt();
        if (valorCorrecte) {
            num = sc.nextInt();
        } else {
            sc.next();
            System.out.println(MSG_2);
        }
        return num;
    }

    public boolean valida(int num1, int MAX, int MIN, String MSG_1) {
        boolean exit;
        if (num1 <= MAX && num1 >= MIN) {
            return exit = true;
        } else {
            System.out.println(MSG_1);
            return exit = false;
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
}