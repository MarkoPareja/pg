/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ejercicio16 {
        private static final String MSG_1 = "Introdueix un nombre en cm: ";
        private static final String MSG_2 = "El nombre introduit en pulgades es : ";
    
        public static void main(String[] args){
        int num = 0;
        double pulgadas = 0.393701;
        Scanner sc = new Scanner(System.in);

        
        System.out.println(MSG_1);
        
        num = sc.nextInt();
        
        System.out.println(MSG_2 + (num * pulgadas));
               
    }
}