/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*
Nom: Marko y Xavi
INS Manuel Vázquez Montalbán
Data d’edició: 4/nov/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class CodeWars {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        if(num1 + num2 > num3){
            System.out.println("Es un triangle");
        }
        else{
            System.out.println("No es un triangle");
        }
    }
}