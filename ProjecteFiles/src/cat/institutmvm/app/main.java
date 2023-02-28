/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import cat.institutmvm.method.method;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {
    private static final String MENU = "Escull una opció:\nA. Veure articles\nB. Enregistrar un nou article\nC. Mostrar total d'articles\nD. Sortir";
    private static final String MSG_1 = "Quina opció vols?: ";
    private static final String MSG_2 = "Indica el nom del document: ";
    private static final String MSG_3 = "La llista d'articles és la seguent:";
    private static final String MSG_4 = "Codi article: ";
    private static final String MSG_5 = "Nom article: ";
    private static final String MSG_6 = "Tipus: ";
    private static final String MSG_7 = "Quantitat: ";
    private static final String MSG_8 = "Preu: ";
    private static final String MSG_9 = "Vols guardar dades en el document habitual o vols crear un de nou?";
    private static final String MSG_10 = "Habitual(0)/Nou(1): ";
    private static final String MSG_11 = "Codi article,Nom article,Tipus,Quantitat,Preu";
    private static final String MSG_12 = "Programa finalizat adeu :)";
    private static final String MSG_13 = "L'archiu te ";
    private static final String MSG_14 = " registres.";
    public static final String BLUE = "\033[0;34m";
    public static final String RESET = "\033[0m";
    
    public static void main(String[] args) {
        int num = 0, tipusDocument = 0, i =0;
        boolean exit = false;
        String codi, nom, tipus, quant, preu;
        String opcio = "", fileName = "";
        Scanner sc = new Scanner(System.in);
        method method = new method();
        StringBuffer sb = new StringBuffer();
        do{
            System.out.println(RESET);
            if(i>=1){
                System.out.println("\n"+MENU+BLUE);
            }
            else{
                System.out.println(MENU+BLUE);
            }
            System.out.print("\n"+MSG_1);
            opcio = sc.next();



            switch(opcio){
                case "A" :
                    System.out.print("\n"+MSG_2);
                    sc.nextLine();
                    fileName = sc.nextLine();

                    fileName = method.comprovarExtensio(fileName);
                    System.out.println("\n"+MSG_3);
                    fileName = method.leerTabla(fileName);
                    break;
                case "B" :
                    System.out.println(MSG_9);
                    System.out.print(MSG_10);
                    tipusDocument = sc.nextInt();

                    if(tipusDocument == 0){
                        fileName = "fileProjecte.txt";
                    }
                    else{
                        System.out.print("\n"+MSG_2);
                        sc.nextLine();
                        fileName = sc.nextLine();
                        fileName = method.comprovarExtensio(fileName);
                    }

                    if (tipusDocument == 1){
                        sb.append(MSG_11 + "\n");
                    }
                    System.out.println(MSG_4);
                    codi = sc.next();
                    sb.append(codi + ",");
                    System.out.println(MSG_5);
                    nom = sc.next();
                    sb.append(nom + ",");
                    System.out.println(MSG_6);
                    tipus = sc.next();
                    sb.append(tipus + ",");
                    System.out.println(MSG_7);
                    quant = sc.next();
                    sb.append(quant + ",");
                    System.out.println(MSG_8);
                    preu = sc.next();
                    sb.append(preu);
                    if( tipusDocument == 0){
                        method.sobreescribirTabla(sb.toString(), fileName);
                    }
                    else{
                        method.escribirTabla(sb.toString(), fileName);
                    }
                    sb.setLength(0);
                    break;
                case "C":
                    System.out.print("\n"+MSG_2);
                    sc.nextLine();
                    fileName = sc.nextLine();
                    fileName = method.comprovarExtensio(fileName);

                    num = method.registres(fileName);
                    num --;

                    System.out.println(MSG_13 + num + MSG_14);
                    break;
                case "D":
                    System.out.println(MSG_12);
                    exit = true;
                    break;
                default :
                    System.out.println("Error");
                    break;
            }
            i++;
        }while(exit != true);
        
    }
    
}
