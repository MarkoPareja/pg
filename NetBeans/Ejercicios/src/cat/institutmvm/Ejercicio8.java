/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Pre: Leemos un numero introducido por teclado y comprovamos si es nautura o no
package cat.institutmvm;

import java.util.Scanner;


public class Ejercicio8 {
    private static final String MSG_1 = "Introduce un número";
    private static final String MSG_2 = "El número es natural";
    private static final String MSG_3 = "El número no es natural";
    
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if(num1 >= 1){
            System.out.println(MSG_2);
        }
        else{
            System.out.println(MSG_3);
        }
    }
    
}
