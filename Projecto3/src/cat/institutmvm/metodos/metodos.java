/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.metodos;

import java.util.Scanner;

public class metodos {

    public int valorCorrecte(Scanner sc, String MSG_1) {
        boolean valorCorrecte;
        int num = 0;
        System.out.print(MSG_1);
        valorCorrecte = sc.hasNextInt();
        if (valorCorrecte) {
            num = sc.nextInt();
        }
        else{
            sc.next();
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
    
   public void bubbleSort(int arrayEdat[], int arrayId[], int arrayTipus[], int arrayImport[], int arrayTlf[], int i, int size) {
        if (i == size - 1) {
            return;
        }
        for (int k = i + 1; k < size - 1; k++) {
            if (arrayEdat[i] > arrayEdat[k]) {
                int canvi = arrayEdat[k];
                arrayEdat[k] = arrayEdat[k];
                arrayEdat[k] = canvi;
                canvi = arrayId[k];
                arrayId[k] = arrayId[k + 1];
                arrayId[k] = canvi;
                canvi = arrayTipus[k];
                arrayTipus[k] = arrayTipus[k];
                arrayTipus[k] = canvi;
                canvi = arrayImport[k];
                arrayImport[k] = arrayImport[k];
                arrayImport[k] = canvi;
                canvi = arrayTlf[k];
                arrayTlf[k] = arrayTlf[k];
                arrayTlf[k] = canvi;
            }
        }
        bubbleSort(arrayEdat, arrayId, arrayTipus, arrayImport, arrayTlf, i + 1, size);
    }

    public boolean searchNum(int num, int num2) {
        boolean trobat = false;

        if (num == num2) {
            trobat = true;
        }
        return trobat;
    }
    
    public int numCount(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
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