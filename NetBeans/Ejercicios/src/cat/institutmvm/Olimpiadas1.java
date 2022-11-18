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
public class Olimpiadas1 {
    public static void main(String[] args){
        int num1 = 0, num2 = 0, num3 = 0, aux = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix dos nombres:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        System.out.println("Introdueix un altre numero entre el " + num1 + " y el " + num2 + ":");
        num3 = sc.nextInt();
        if (num3 > num1 && num3 < num2){
            System.out.println("Numero dins del rang");
        }
        else{
            System.out.println("Numero fora del rang");
        }
    }
}
