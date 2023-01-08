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
public class valida2 {
    public void valida2(int num1){
        int min = 15, max = 200, i;
        int[] arrayint = new int[10];
        boolean exit = false, quit = false;
        Scanner sc = new Scanner(System.in);
        
        for(i = 0; i < arrayint.length; i++){
        arrayint[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }
        //for(i = 0; i < arrayint.length; i++){
        //    System.out.println(arrayint[i]);
        //}
        i = 0;
        do{
            if(i < 10){
                if(num1 == arrayint[i]){
                    exit = true;
                }
                else{
                    exit = false;
                }
                i++;
            }
            else{
                exit = true;
                quit=true;
            }
        }while(!quit && !exit);
        
        if(quit){
            System.out.println("El nombre no s'ha trobat a la llista");
        }
        else{
            System.out.println("El nombre s'ha trobat a la llista");
        }
    }
}
