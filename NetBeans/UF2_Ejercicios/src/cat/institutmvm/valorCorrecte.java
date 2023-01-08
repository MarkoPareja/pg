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
public class valorCorrecte {
    
    public int valorCorrecte(){
        Scanner sc = new Scanner(System.in);
        boolean valorCorrecte;
        int num = 0;
        do{     
                System.out.println("Introdueix un nombre: ");
                valorCorrecte = sc.hasNextInt();
                if(valorCorrecte){
                    num = sc.nextInt();
                }
                else{
                    sc.next();
                    System.out.println("Error");
                }
            }while(!valorCorrecte);
        return num;
    }
}
