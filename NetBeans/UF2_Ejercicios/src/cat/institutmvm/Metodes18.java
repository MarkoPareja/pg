/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Metodes18 {

    public static void main(String[] args) {
        String txt, trob;
        boolean trobat;
        Scanner sc = new Scanner(System.in);

        ListaMetodos method = new ListaMetodos();

        System.out.println("Introdueix per teclat una paraula");

        txt = sc.nextLine();

        System.out.println("\nIntrodueix un caracter a trobar en la "
                + "paraula anterior");

        trob = sc.next();

        trobat = method.searchTxt(txt, trob);

        if (trobat) {
            System.out.println("Si s'ha trobat la lletra dins de la paraula");
        } else {
            System.out.println("No s'ha trobat la lletra dins de la paraula");
        }
    }
}
