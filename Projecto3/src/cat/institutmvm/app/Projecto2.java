/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.app;

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
    private static final String MSG_1 = "ID Usuario ";
    private static final String MSG_2 = "\nEdad: ";
    private static final String MSG_3 = "\nTipus de venda: \n" + "0-Venda lliure\n1-Pensionista\n2-Carnet Jove\n3-Soci";
    private static final String MSG_4 = "Import de la compra: ";
    private static final String MSG_5 = "Telèfon de contacte: ";
    private static final String MSG_6 = "ID\tEdad\tTipus\tImport\tTelefon";
    private static final String MSG_7 = "A continuació et demanarem les teves dades i les ompliras per teclat";
    private static final String MSG_8 = "Pensio";
    private static final String MSG_9 = "Error";
    private static final String MSG_10 = "Lliure";
    private static final String MSG_11 = "Pensionista";
    private static final String MSG_12 = "Jove";
    private static final String MSG_13 = "Soci";
    private static final String MSG_14 = "Cuants clients vols introduir: ";
    private static final String MSG_15 = "S'han introduït ";
    private static final String MSG_16 = " registres de clients";
    private static final String MSG_17 = "Vols consultar per tipus de client?(si: 1/ no:0)";
    private static final String MSG_18 = "Quin tipus de client? : ";
    private static final String MSG_19 = "Dades de clients de tipus ";
    private static final String MSG_20 = "Seguent registre: ";
    private static final String MSG_21 = "\nErrors complerts" + "\nVols introdïr un nou registre? (si: 1/ no:0)";
    private static final String MSG_22 = "Vols veure un resum estadístic de les dades? (si: 1/ no:0) ";
    private static final String MSG_23 = "Mitjana d’edat: ";
    private static final String MSG_25 = "Número de clients per tipus: "; 
    private static final String MSG_26 = "Import total: ";
    private static final String MSG_27 = "Histograma de número de clients per tipus: ";
    private static final String MSG_28 = "No hi han registres per mostrar.";
    private static final String MSG_29 = "Número de clients introduits: ";
    private static final int TLF = 9;

    public static void main(String[] args) {
        int res = 0, size = 0, numpersona = 0, resum = 0;
        int j = 0, consultaclient = 0, seguiment = 0, finalitza = 0;
        int lliure = 0, pensio = 0, jove = 0, soci = 0;
        double mitjana = 0, total = 0;
        boolean valorCorrecte = false, exit = false;
        boolean l = false, p = false, c = false, s = false;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_7 + "\n" + MSG_14);
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                size = sc.nextInt();
                if (size >= 1) {
                    exit = true;
                } else {
                    System.out.println(MSG_9);
                }
            } else {
                sc.next();
                System.out.println(MSG_9);
            }
        } while (exit != true);

        int[] arrayId = new int[size];
        int[] arrayEdat = new int[size];
        int[] arrayTipus = new int[size];
        int[] arrayImport = new int[size];
        int[] arrayTelefon = new int[size];
        int[] arrayTlf = new int[size];

        do {
            for (int i = 0; i < size; i++) {
                exit = false;
                seguiment = 3;
                System.out.println(MSG_1);
                j = 0;
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        arrayId[i] = sc.nextInt();
                        if (arrayId[i] <= 999 && arrayId[i] >= 111) {
                            exit = true;
                        } else {
                            System.out.println(MSG_9);
                            j++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_9);
                        j++;
                    }
                    if (j == 3) {
                        System.out.println(MSG_21);
                        do {
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                seguiment = sc.nextInt();
                                if (seguiment == 1 || seguiment == 0) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_9);
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_9);
                            }
                        } while (exit != true);
                    }
                } while (exit != true);
                if (j == 3 && seguiment == 0) {
                    finalitza = 1;
                }
                if (seguiment == 0) {
                } else {
                    if (seguiment == 1) {
                    } else {
                        seguiment = 3;
                        exit = false;
                        j = 0;
                        System.out.println(MSG_2);
                        do {
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                arrayEdat[i] = sc.nextInt();
                                if (arrayEdat[i] >= 14 && arrayEdat[i] <= 100) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_9);
                                    j++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_9);
                                j++;
                            }
                            if (j == 3) {
                                System.out.println(MSG_21);
                                do {
                                    valorCorrecte = sc.hasNextInt();
                                    if (valorCorrecte) {
                                        seguiment = sc.nextInt();
                                        if (seguiment == 1 || seguiment == 0) {
                                            exit = true;
                                        } else {
                                            System.out.println(MSG_9);
                                        }
                                    } else {
                                        sc.next();
                                        System.out.println(MSG_9);
                                    }
                                } while (exit != true);
                            }
                        } while (exit != true);
                        if (j == 3 && seguiment == 0) {
                            finalitza = 1;
                        }
                        if (seguiment == 1) {
                        } else {
                            if (seguiment == 0) {
                            } else {
                                seguiment = 3;
                                j = 0;
                                exit = false;
                                System.out.println(MSG_3);
                                do {
                                    valorCorrecte = sc.hasNextInt();
                                    if (valorCorrecte) {
                                        arrayTipus[i] = sc.nextInt();
                                        switch (arrayTipus[i]) { //Amb el switch case emmagatzarem el resultat de la variable out.

                                            case 0:
                                                System.out.println(MSG_10);
                                                exit = true;
                                                break;
                                            case 1:
                                                System.out.println(MSG_11);
                                                exit = true;
                                                break;
                                            case 2:
                                                System.out.println(MSG_12);
                                                exit = true;
                                                break;
                                            case 3:
                                                System.out.println(MSG_13);
                                                exit = true;
                                                break;
                                            default:
                                                j++;
                                                System.out.println(MSG_9);
                                                break;
                                        }
                                    } else {
                                        sc.next();
                                        System.out.println(MSG_9);
                                        j++;
                                    }
                                    if (j == 3) {
                                        System.out.println(MSG_21);
                                        do {
                                            valorCorrecte = sc.hasNextInt();
                                            if (valorCorrecte) {
                                                seguiment = sc.nextInt();
                                                if (seguiment == 1 || seguiment == 0) {
                                                    exit = true;
                                                } else {
                                                    System.out.println(MSG_9);
                                                }
                                            } else {
                                                sc.next();
                                                System.out.println(MSG_9);
                                            }
                                        } while (exit != true);
                                    }
                                } while (exit != true);
                                if (j == 3 && seguiment == 0) {
                                    finalitza = 1;
                                }
                                if (seguiment == 1) {
                                } else {
                                    if (seguiment == 0) {
                                    } else {
                                        seguiment = 3;
                                        j = 0;
                                        exit = false;
                                        System.out.println("\n" + MSG_4);
                                        do {
                                            valorCorrecte = sc.hasNextInt();
                                            if (valorCorrecte) {
                                                arrayImport[i] = sc.nextInt();
                                                if (arrayImport[i] >= 0 && arrayImport[i] <= 1000) {
                                                    exit = true;
                                                } else {
                                                    System.out.println(MSG_9);
                                                    j++;
                                                }
                                            } else {
                                                sc.next();
                                                System.out.println(MSG_9);
                                                j++;
                                            }
                                            if (j == 3) {
                                                System.out.println(MSG_21);
                                                do {
                                                    valorCorrecte = sc.hasNextInt();
                                                    if (valorCorrecte) {
                                                        seguiment = sc.nextInt();
                                                        if (seguiment == 1 || seguiment == 0) {
                                                            exit = true;
                                                        } else {
                                                            System.out.println(MSG_9);
                                                        }
                                                    } else {
                                                        sc.next();
                                                        System.out.println(MSG_9);
                                                    }
                                                } while (exit != true);
                                            }
                                        } while (exit != true);
                                        if (j == 3 && seguiment == 0) {
                                            finalitza = 1;
                                        }
                                        if (seguiment == 1) {
                                        } else {
                                            if (seguiment == 0) {
                                            } else {
                                                seguiment = 3;
                                                j = 0;
                                                System.out.println("\n" + MSG_5);
                                                exit = false;
                                                do { //Repetim amb la mateix estructura les altres variables, amb un while més. 
                                                    res = 0;
                                                    valorCorrecte = sc.hasNextInt();
                                                    if (valorCorrecte) {
                                                        arrayTelefon[i] = sc.nextInt();
                                                        arrayTlf[i] = arrayTlf[i] + arrayTelefon[i];
                                                        while (arrayTelefon[i] != 0) { //Aquí verificarem el número de xifres que te el valor.   
                                                            arrayTelefon[i] = (arrayTelefon[i] / 10); //Dividem entre 10 per saber el número de xifres.
                                                            res = res + 1;
                                                        }
                                                        if (res == TLF) { //Si el número de xifres es 9, s'emmagatzera.
                                                            exit = true;
                                                        } else {
                                                            System.out.println(MSG_9);
                                                            j++;
                                                        }
                                                    } else {
                                                        sc.next();
                                                        System.out.println(MSG_9);
                                                        j++;
                                                    }
                                                    if (j == 3) {
                                                        System.out.println(MSG_21);
                                                        do {
                                                            valorCorrecte = sc.hasNextInt();
                                                            if (valorCorrecte) {
                                                                seguiment = sc.nextInt();
                                                                if (seguiment == 1 || seguiment == 0) {
                                                                    exit = true;
                                                                } else {
                                                                    System.out.println(MSG_9);
                                                                }
                                                            } else {
                                                                sc.next();
                                                                System.out.println(MSG_9);
                                                            }
                                                        } while (exit != true);
                                                    }
                                                } while (exit != true);
                                                if (j == 3 && seguiment == 0) {
                                                    finalitza = 1;
                                                }
                                                if (seguiment == 1) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (seguiment == 1 && size == 1) {
                    System.out.println("\n" + MSG_20);
                } else {
                    numpersona++;
                    if (numpersona < size && finalitza == 0) {
                        System.out.println("\n" + MSG_20);  
                    }
                }
                if (j == 3) {
                    if (i != 0 && finalitza == 0) {
                        i--;
                        numpersona--;
                    }
                }
                if (finalitza == 1) {
                    i = 100;
                }
            }
            if (numpersona == size) {
                finalitza = 1;
            }
        } while (finalitza == 0);
        if (seguiment == 0 && size == 1) {
        } else {
            System.out.println("\nA continuació mostrem les dades:");
            System.out.println("\n" + MSG_6);
            for (int i = 0; i < size; i++) {
                if (arrayTlf[i] > 111111111 && arrayTlf[i] < 999999999) {
                    System.out.print(arrayId[i] + "\t" + arrayEdat[i] + "\t");
                    switch (arrayTipus[i]) {

                        case 0:
                            System.out.print(MSG_10);
                            lliure++;
                            l = true;
                            break;
                        case 1:
                            System.out.print(MSG_8);
                            pensio++;
                            p = true;
                            break;
                        case 2:
                            System.out.print(MSG_12);
                            jove++;
                            c = true;
                            break;
                        case 3:
                            System.out.print(MSG_13);
                            soci++;
                            s = true;
                            break;
                    }
                    System.out.print("\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\n");
                }
            }
            System.out.println(MSG_15 + numpersona + MSG_16 + "\n");
            System.out.println(MSG_17);
            exit = false;
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    consultaclient = sc.nextInt();
                    if (consultaclient == 1 || consultaclient == 0) {
                        exit = true;
                    } else {
                        System.out.println(MSG_9);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_9);
                }
            } while (exit != true);
            if (consultaclient == 1) {
                System.out.print( MSG_18);
                exit = false;
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        consultaclient = sc.nextInt();
                        for (int i = 0; i < size; i++) {
                            if (arrayTipus[i] != consultaclient) {
                                exit = true;
                            } else {
                                switch (consultaclient) { //Amb el switch case emmagatzarem el resultat de la variable out.

                                    case 0:
                                        System.out.println(MSG_19 + MSG_10);
                                        exit = true;
                                        break;
                                    case 1:
                                        System.out.println(MSG_19 + MSG_8);
                                        exit = true;
                                        break;
                                    case 2:
                                        System.out.println(MSG_19 + MSG_12);
                                        exit = true;
                                        break;
                                    case 3:
                                        System.out.println(MSG_19 + MSG_13);
                                        exit = true;
                                        break;
                                    default:
                                        j++;
                                        System.out.println(MSG_9);
                                        break;
                                }
                                i = 100;
                            }
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_9);
                    }
                } while (exit != true);  //Aquí
                for (int i = 0; i < size - 1; i++) {
                    for (int k = i + 1; k < size; k++) {
                        if (arrayEdat[i] > arrayEdat[k]) {
                            int canvi = arrayEdat[i];
                            arrayEdat[i] = arrayEdat[k];
                            arrayEdat[k] = canvi;
                            canvi = arrayId[i];
                            arrayId[i] = arrayId[k];
                            arrayId[k] = canvi;
                            canvi = arrayTipus[i];
                            arrayTipus[i] = arrayTipus[k];
                            arrayTipus[k] = canvi;
                            canvi = arrayImport[i];
                            arrayImport[i] = arrayImport[k];
                            arrayImport[k] = canvi;
                            canvi = arrayTlf[i];
                            arrayTlf[i] = arrayTlf[k];
                            arrayTlf[k] = canvi;
                        }
                    }
                }
                for (int i = 0; i < size; i++) {
                    if (arrayTlf[i] > 111111111 && arrayTlf[i] < 999999999) {
                        if (l == false && p == false && s == false && c == false) {
                            System.out.println(MSG_28);
                            i = 100;
                        }
                    }
                }   
                for (int i = 0; i < size; i++) {
                    if (arrayTlf[i] > 111111111 && arrayTlf[i] < 999999999) {
                        if (arrayTipus[i] == consultaclient) {
                            System.out.println(MSG_6);
                            i = 100;
                        }
                    }
                }
                for (int i = 0; i < size; i++) {
                    if (arrayTipus[i] == consultaclient) {
                        if (arrayTlf[i] > 111111111 && arrayTlf[i] < 999999999) {
                            switch (arrayTipus[i]) {

                                case 0:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_10 + "\t" + arrayImport[i] + "\t" + arrayTlf[i]);
                                    break;
                                case 1:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_8 + "\t" + arrayImport[i] + "\t" + arrayTlf[i]);
                                    break;
                                case 2:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_12 + "\t" + arrayImport[i] + "\t" + arrayTlf[i]);
                                    break;
                                case 3:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_13 + "\t" + arrayImport[i] + "\t" + arrayTlf[i]);
                                    break;
                            }
                        }
                    }
                }
            }
            exit = false;
            System.out.print("\n" + MSG_22 + "\n"); // Aquí preguntarem si volem fer un resum estadístic
            do {
                valorCorrecte = sc.hasNextInt();
                if (valorCorrecte) {
                    resum = sc.nextInt();
                    if (resum == 1 || resum == 0) {
                        exit = true;
                    } else {
                        System.out.println(MSG_9);
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_9);
                }
            } while (exit != true);
            if (resum == 1) {
                System.out.println("\n" + MSG_29 + size + "\n");
                for (int i = 0; i < size; i++) {
                    mitjana = mitjana + arrayEdat[i];
                }
                System.out.println(MSG_23 + mitjana / size +" anys" + "\n");
                System.out.println(MSG_25 + "\n");
                if (l == true) {
                    System.out.println("Lliure: " + lliure);
                }
                if (p == true) {
                    System.out.println("Pensio: " + pensio);
                }
                if (c == true) {
                    System.out.println("Jove: " + jove);
                }
                if (s == true) {
                    System.out.println("Soci: " + soci);
                }
                System.out.println("\n" + MSG_27);
                System.out.println("-----------------------------");
                if (lliure != 0) {
                    System.out.print("Lliure: ");
                    for (int i = 0; i < lliure; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (pensio != 0) {
                    System.out.print("Pensio: ");
                    for (int i = 0; i < pensio; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (jove != 0) {
                    System.out.print("Jove: ");
                    for (int i = 0; i < jove; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (soci != 0) {
                    System.out.print("Soci: ");
                    for (int i = 0; i < soci; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 0; i < size; i++) {
                    total = total + arrayImport[i];
                }
                System.out.println("\n" + MSG_26 + total);
            }
        }
        if (seguiment == 0 && size == 1) {
            System.out.print("\n" + MSG_22);
        }
    }
}