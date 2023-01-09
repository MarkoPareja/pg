/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Metodes14 {

    private static final String MSG_1 = "Introdueix un nombre";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaMetodos method = new ListaMetodos();

        int num1;

        num1 = method.valorCorrecte(sc);
        method.randomSearch(num1);
        sc.close();
    }
}
