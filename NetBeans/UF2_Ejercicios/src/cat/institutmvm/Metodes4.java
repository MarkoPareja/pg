/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*
Nom: Marko 
Cognoms: Pareja Bailén
INS Manuel Vázquez Montalbán
Data d’edició: 28/nov/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Metodes4 {
    private static final String MSG_1 = "Introdueix un nombre";
    private static final String MSG_2 = "Programa finalizat per eror en dades";
    private static final String MSG_3 = "Error";
    private static final String MSG_4 = "El resultat es: ";
    
    public static void main(String[] args) {
        Metodes4 method = new Metodes4();
        int num1 = method.natural();
        if(num1 > 0 ){
        System.out.println("\n"+ MSG_4 + num1);
        }
    }

    public int natural() {
        Scanner sc = new Scanner(System.in);
        boolean valorCorrecte;
        int num = 0, i = 0;
        do {
            if (i >= 3){
                System.out.println(MSG_2);
                break;
            }    
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println(MSG_3);
                    i++;
                }
            } else {
                sc.next();
                System.out.println(MSG_3);
                i++;
            }
        } while (!valorCorrecte || num < 0);
        return num;
    }
}