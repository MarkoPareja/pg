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
public class Olimpiadas3 {
    public static void main(String[] args){
        int i, num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix la cuantitat de nombres que vols emmagatzemar: ");
        
        num = sc.nextInt();
        
        System.out.println("Introdueix " + num + " nombres");
        
        int[] arrayint = new int[num];
        
        for (i = 0; i < arrayint.length; i++) {
            arrayint[i] = sc.nextInt();
        }
        
        System.out.println("\n");
        System.out.println("\nResultat:");
        for (i = arrayint.length-1; i >= 0; i--) {
            System.out.print(arrayint[i] + " ");
        }
        System.out.println("\n");
    }
}
