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
public class Olimpiadas2 {
    public static void main(String[] args){
        int i, num = 0 ;
        boolean trobat = false;
        int[] arrayint = new int[20];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix 20 nombres: ");
        
        for (i = 0; i < arrayint.length; i++) {
            arrayint[i] = sc.nextInt();
        }
        
        System.out.println("Introdueix el nombre que vols comprovar: ");
        num = sc.nextInt();
        
        for (i = 0; i < arrayint.length; i++){
            if (arrayint[i] == num){
                trobat = true;
            }
        }
        if (trobat){
            System.out.println("S'ha trobat un valor");
        }
        else{
            System.out.println("No s'ha trobat un valor");
        }
        
    }
}
