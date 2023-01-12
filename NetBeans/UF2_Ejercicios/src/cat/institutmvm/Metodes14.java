/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Metodes14 {

    private static final String MSG_1 = "Introdueix un nombre";

    public static void main(String[] args) {
        int[] arrayint = new int[10];
        int num1, num2 = 0, i;
        boolean trobat = false;
        Scanner sc = new Scanner(System.in);

        ListaMetodos method = new ListaMetodos();

        num1 = method.valorCorrecte(sc);
        
        for (i = 0;  i<arrayint.length; i++){
           num2 = method.random(200);
           arrayint[i] = num2;
        }
        
        for (i = 0;  i<arrayint.length; i++){
            System.out.println(arrayint[i]);
        }
        
        i = 0 ;
        while(!trobat || i == arrayint.length){
            trobat = method.searchNum(num1, arrayint[i]);
            i++;
        }
        
        sc.close();
    }
}