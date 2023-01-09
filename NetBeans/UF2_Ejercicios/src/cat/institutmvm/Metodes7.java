/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author alumne_1r
 */

import java.util.Scanner;
import java.lang.Math;

public class Metodes7 {
    private static final String MSG_1 = "Introdueix un nombre";
    private static final String MSG_2 = "El resultat es: ";
    
    public static void main(String[] args) {
        System.out.println(MSG_1);
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int absValue = Math.abs(num);
        System.out.println("\n"+ MSG_2 + absValue);
    }
}