/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*
Nom: Marko 
Cognoms: Pareja Bailén
INS Manuel Vázquez Montalbán
Data d’edició: 28/nov/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Metodes {
    private static final String MSG_1 = "Introdueix un nombre";
    
    public static void main(String[] args) {
        Metodes method = new Metodes();
        int num1 = method.natural();
        int num2 = method.natural();
        int num3 = method.natural();
        System.out.println("\n"+num1+" "+num2+" "+num3);
    }
    
    public int natural(){
        Scanner sc = new Scanner(System.in);
        boolean valorCorrecte;
        int num = 0;
        do{     
                System.out.println(MSG_1);
                valorCorrecte = sc.hasNextInt();
                if(valorCorrecte){
                    num = sc.nextInt();
                    if(num < 0){
                        System.out.println("Error");
                    }
                }
                else{
                    sc.next();
                    System.out.println("Error");
                }
            }while(!valorCorrecte || num < 0);
        return num;
    }
}
