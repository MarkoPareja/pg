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
Data d’edició: 25/nov/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Projecto2 {
    private static final String MSG_1 = "ID: ";
    private static final String MSG_2 = "\nEdad: ";
    private static final String MSG_3 = "\nTipus de venda: ";
    private static final String MSG_4 = "0-Venda lliure\n1-Pensionista\n2-Carnet Jove\n3-Soci";
    private static final String MSG_5 = "Import de la compra: ";
    private static final String MSG_6 = "Telèfon de contacte: ";
    private static final String MSG_7 = "ID\tEdad\tTipus\tImport\tTelefon";
    private static final String MSG_8 = "A continuació et demanarem les teves dades i les ompliras per teclat";
    private static final String MSG_9 = "Programa finalitzat per error en dades";
    private static final String MSG_10 = "Error";
    private static final String MSG_11 = "Lliure";
    private static final String MSG_12 = "Pensionista";
    private static final String MSG_13 = "Jove";
    private static final String MSG_14 = "Soci";
    private static final String MSG_15 = "Cuants clients vols introduir: ";
    private static final String MSG_16 = "S'han introduït ";
    private static final String MSG_17 = " registres de clients";
    private static final String MSG_18 = "Vols consultar per tipus de client?(si: 1/ no:0)";
    private static final String MSG_19 = "Quin tipus de client?";
    
    public static void main(String[] args) {
        int tipus = 0, res = 0, telefon = 0, i = 0, j = 0, num = 0, tipocli = 0;
        boolean valorCorrecte = false, exit = false;
        Scanner sc = new Scanner(System.in);
        
        do{
                System.out.println(MSG_15);
                valorCorrecte = sc.hasNextInt();
                if(valorCorrecte){
                    num = sc.nextInt();
                }
                else{
                    sc.next();
                    System.out.println("Error");
                }
            }while(!valorCorrecte);
        
        int[] arrayint = new int[num];
        int[] arrayid = new int[num];
        int[] arrayedat = new int[num];
        int[] arraytipus = new int[num];
        int[] arraycompra = new int[num];
        int[] arraytlf = new int[num];
        
        System.out.println(MSG_8);
        
        for(j=0; j<arrayint.length; j++){
            do {
                System.out.println(MSG_1);
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    arrayid[j] = sc.nextInt();
                    if (arrayid[j] >= 111 && arrayid[j] <= 999) {
                        exit = true;
                    } else {
                        System.out.println(MSG_10);
                        i++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_10);
                    i++;
            }
            if (i == 3) {
                exit = true;
            }
            } while (exit != true);
            if (i == 3) {
                System.out.println(MSG_9);
            } else {
                exit = false;
                i = 0;
                do {
                    System.out.println(MSG_2);
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        arrayedat[j] = sc.nextInt();
                        if (arrayedat[j] >= 14 && arrayedat[j] <= 120) {
                            exit = true;
                        } else {
                            System.out.println(MSG_10);
                            i++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_10);
                        i++;
                    }
                    if (i == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (i == 3) {
                    System.out.println(MSG_9);
                } 
                else {
                    System.out.println(MSG_3 + "\n" + MSG_4 + "\n");
                    exit = false;
                    do{
                        valorCorrecte = sc.hasNextInt();
                        if(valorCorrecte){
                            tipus = sc.nextInt();
                            switch (tipus) {
                                case 0:
                                    arraytipus[j] = 0;
                                    System.out.println(MSG_11);
                                    exit = true;
                                    break;
                                case 1:
                                    arraytipus[j] = 1;
                                    System.out.println(MSG_12);
                                    exit = true;
                                    break;
                                case 2:
                                    arraytipus[j] = 2;
                                    System.out.println(MSG_13);
                                    exit = true;
                                    break;
                                case 3:
                                    arraytipus[j] = 3;
                                    System.out.println(MSG_14);
                                    exit = true;
                                    break;
                                default:
                                    i++ ;
                                    System.out.println(MSG_10);
                                    break;
                            }
                        }
                        else{
                            sc.next();
                            System.out.println(MSG_10);
                            i++;
                        }
                        if (i == 3) {
                            exit = true;
                        }
                    } while (exit != true);

                    if (i == 3) {
                        System.out.println(MSG_9);
                    } 
                    else {
                        i = 0;
                        exit = false;
                        System.out.println("\n" + MSG_5);
                        do {
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                arraycompra[j] = sc.nextInt();
                                if (arraycompra[j] >= 0 && arraycompra[j] <= 1000) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_10);
                                    i++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_9);
                                i++;
                            }
                            if (i == 3) {
                                exit = true;
                            }
                        } while (exit != true);
                        if (i == 3) {
                            System.out.println(MSG_9);
                        } else {
                            System.out.println("\n" + MSG_6);
                        }
                        i = 0;
                        exit = false;
                        do {
                            res = 0;
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                telefon = sc.nextInt();
                                arraytlf[j] = arraytlf[i] + telefon;
                                while (telefon != 0) { //Aquí verificarem el número de xifres que te el valor.   
                                    telefon = (telefon / 10); //Dividem entre 10 per saber el número de xifres.
                                    res = res + 1;
                                }
                                if (res == 9) { //Si el número de xifres es 9, s'emmagatzera.
                                    exit = true;
                                } else {
                                    System.out.println(MSG_10);
                                    i++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_10);
                                i++;
                            }
                            if (i == 3) {
                                exit = true;
                            }
                        } while (exit != true);
                        if (i == 3) {
                            System.out.println(MSG_9);
                        }
                    }
                }
            }
        }
        System.out.println("\n" + MSG_7);
            for(j=0; j<arrayint.length; j++){
            System.out.println(arrayid[j] + "\t" + arrayedat[j] + "\t" + arraytipus[j] + "\t" + arraycompra[j] + "\t" + arraytlf[j]);
        }
        System.out.println("\n" + MSG_16 + num + MSG_17);
        
        System.out.print("\n" + MSG_18);
        tipocli = sc.nextInt();
        
        if (tipocli == 1){
            System.out.print("\n" + MSG_19);
            tipocli = sc.nextInt();
            switch (tipocli){
                case 1:
                    System.out.println("hola");
            }
        }
    }
}