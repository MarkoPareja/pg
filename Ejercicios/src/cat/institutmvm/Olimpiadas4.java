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
public class Olimpiadas4 {
    public static void main(String[] args){
        int num = 0;
        double pulgadas = 0.393701;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introdueix un nombre en cm: ");
        
        num = sc.nextInt();
        
        System.out.println("El nombre introduit en pulgades es : " + (num * pulgadas));
               
    }
}
