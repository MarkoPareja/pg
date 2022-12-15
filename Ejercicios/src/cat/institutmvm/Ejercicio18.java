/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Ejercicio18 {
    private static final String MSG_1 = "Introduce un numero para convertirlo en valor absoluto: ";
    private static final String MSG_2 = "El valor absoludo es ";
    
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        
        if(num1 < 0) {
            num1 = (num1 * -1);
        }
        System.out.println(MSG_2 + num1);
    }
}
