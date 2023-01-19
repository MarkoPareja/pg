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
public class Metodes17 {
    
    public static void main(String[] args){
        String txt;
        int cont;
        Scanner sc = new Scanner(System.in);

        ListaMetodos method = new ListaMetodos();

        System.out.println("Introdueix per teclat la paraula que vulguis "
                + "saber els seus caràcters");
        
        txt = sc.nextLine();
        
        cont = method.textCount(txt);
        
        System.out.println("La paraula té " + cont + " caràcters");
    }
}
