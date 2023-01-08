/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author marko
 */
public class valida {
     public void valida(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        //int num1 = 0 , num2 = 0 ;
        if(num1 > num2){
            System.out.println("El primer nombre es mes gran que el segon");
        }
        else if(num1 < num2){
            System.out.println("El segon nombre es mes gran que el primer");
        }
        else{
            System.out.println("Els nombres son iguals");
        }
    }
}
