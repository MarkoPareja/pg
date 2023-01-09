/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Metodes13 {

    private static final String MSG_1 = "Introdueix un nombre";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaMetodos method = new ListaMetodos();

        int num1, num2;

        num1 = method.valorCorrecte(sc);
        num2 = method.valorCorrecte(sc);
        method.valida(num1, num2);
        sc.close();
    }
}
