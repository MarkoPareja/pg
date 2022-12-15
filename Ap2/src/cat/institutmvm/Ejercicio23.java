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
Data d’edició: 24/nov/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Ejercicio23 { //Declaramos las constantes necesarias
    private static final String MSG_1 = "Introdueix la teva edad: ";
    private static final String MSG_2 = "Introdueix el teu sexe (H / D): ";
    private static final String MSG_3 = "Introdueix el teu salari: ";
    private static final String MSG_4 = "Ets becari ? (true or false)";
    private static final String MSG_5 = "Persona    Edad    Sexe    Salari    Becari";
    
    public static void main(String[] args){
        //Declaramos la variables necesarias
        int i=0, num = 0;
        int[] arrayint = new int[10];
        char[] arraychar = new char[10];
        float[] arrayfloat = new float[10];
        boolean[] arrayboolean = new boolean[10];
        boolean valorCorrecte = false, booleanCorrecte = false;
        Scanner sc = new Scanner(System.in); //Abrimos el flujo de scanner
        
        //Creamos un blucle con for, lo que hace es repetir 4 do's 10 veces, 
        //todo esta ligado a la misma i lo que hace que todo se haga 10 veces.
        for(i=0; i<arrayint.length; i++){
            do{
                System.out.println(MSG_1);
                valorCorrecte = sc.hasNextInt();
                if(valorCorrecte){
                    arrayint[i] = sc.nextInt();
                }
                else{
                    sc.next();
                    System.out.println("Error");
                }
            }while(!valorCorrecte);
            do{
                num = 0;
                System.out.println(MSG_2);
                arraychar[i] = sc.next().charAt(0);
                if(arraychar[i] == 'H' || arraychar[i] == 'D'){
                    num = 1;
                }
                else{
                    System.out.println("Error");
                }
            }while(num != 1);
             do{
                System.out.println(MSG_3);
                valorCorrecte = sc.hasNextFloat();
                if(valorCorrecte){
                    arrayfloat[i] = sc.nextFloat();
                }
                else{
                    sc.next();
                    System.out.println("Error");
                }
            }while(!valorCorrecte);
            do{
                num = 0;
                System.out.println(MSG_4);
                booleanCorrecte = sc.hasNextBoolean();
                if(booleanCorrecte){
                    arrayboolean[i] = sc.nextBoolean();
                    num = 1;
                }
                else{
                    sc.next();
                    System.out.println("Error");
                }
            }while(num != 1);
            System.out.println("\nSiguiente alumno\n");
        }
        //Printamos la estructura de la tabla y los resultados obtenidos
        System.out.println(MSG_5);
        for(i=0; i<arrayint.length; i++){
            System.out.println(i + "          " + arrayint[i] + "       " + arraychar[i] + "      " +arrayfloat[i] + "     " + arrayboolean[i]);
        }
    }
}
