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
public class Metodes13 {
    private static final String MSG_1 = "Introdueix un nombre";
    
    public static void main(String[] args) {
        valorCorrecte method = new valorCorrecte();
        valida val = new valida();
        
        int num1, num2;

        num1 = method.valorCorrecte();
        num2 = method.valorCorrecte();
        val.valida(num1, num2);
    }
}