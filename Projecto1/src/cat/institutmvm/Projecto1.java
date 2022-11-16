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
Data d’edició: 28/oct/2022
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class Projecto1 {

    private static final String MSG_1 = "ID: ";
    private static final String MSG_2 = "\nEdad: ";
    private static final String MSG_3 = "\nTipus de venda: ";
    private static final String MSG_4 = "0-Venda lliure\n1-Pensionista\n2-Carnet Jove\n3-Soci";
    private static final String MSG_5 = "Import de la compra: ";
    private static final String MSG_6 = "Telèfon de contacte: ";
    private static final String MSG_7 = "ID     Edad    Tipus   Import  Telefon";
    private static final String MSG_8 = "A continuació et demanarem les teves dades i les ompliras per teclat";
    private static final String MSG_9 = "Programa finalitzat per error en dades";
    private static final String MSG_10 = "Error";
    private static final String MSG_11 = "Lliure";
    private static final String MSG_12 = "Pensionista";
    private static final String MSG_13 = "Jove";
    private static final String MSG_14 = "Soci";

    public static void main(String[] args) {
        int id = 0, edat = 0, tipus = 0, tlf = 0, res = 0, compra = 0, telefon = 0, i = 0, j = 0;
        String tipusln = "";
        boolean valorCorrecte = false, exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_8);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                id = sc.nextInt();
                if (id >= 111 && id <= 999) {
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
                    edat = sc.nextInt();
                    if (edat >= 14 && edat <= 120) {
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
                                tipusln = MSG_11;
                                System.out.println(MSG_11);
                                exit = true;
                                break;
                            case 1:
                                tipusln = MSG_12;
                                System.out.println(MSG_12);
                                exit = true;
                                break;
                            case 2:
                                tipusln = MSG_13;
                                System.out.println(MSG_13);
                                exit = true;
                                break;
                            case 3:
                                tipusln = MSG_14;
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
                } else {
                    i = 0;
                    exit = false;
                    System.out.println("\n" + MSG_5);
                    do {
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            compra = sc.nextInt();
                            if (compra >= 0 && compra <= 1000) {
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
                        tlf = 0;
                        res = 0;
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            telefon = sc.nextInt();
                            tlf = tlf + telefon;
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
                    } else {
                        System.out.println("\n" + MSG_7);
                        System.out.println(id + "     " + edat + "      " + tipusln + "    " + compra + "   " + tlf);
                    }               
                }
            }
        }       
    }
}