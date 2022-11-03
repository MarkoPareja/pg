/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*
Nom: Marko 
Cognoms: Pareja Bailén
INS Manuel Vázquez Montalbán
Data d’edició: 28/oct/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Ejercicio12 {
    private static final String MSG_1 = "Indrodueix un nombre: ";
    
    public static void main(String[] args){
        int num, res = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if(valorCorrecte){
                num = sc.nextInt();
                while(num >= 10){
                        num = (num - 10);
                        res = res + 1;
                }
            }
            else{
                sc.next();
                System.out.println("Error");
            }
        }while(!valorCorrecte);
        System.out.println(res);
    }
}
